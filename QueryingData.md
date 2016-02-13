# Define Connections #

In order to execute a data query, we must first define the source to which the data must connect. A project can have one or more data sources at its disposal. Notice that we create a JDBC data source (connection), set all required properties, and then add it to the report.
```
JdbcConnection conn1 = new JdbcConnection();
conn1.setDatabaseUser("sa");
conn1.setDatabasePassword("");
conn1.setDriverClass("org.h2.Driver");
conn1.setDatabaseUrl("jdbc:h2:mem:test-db;DB_CLOSE_DELAY=-1");

report.getDataConnections().add(conn1);
```

# Define Data Queries #

Now we can create a data query. A report can have one or more queries. So first, we will create a `JdbcQuery` object and provide it with the previously created connection and a sql statement.
```
JdbcQuery query1 = new JdbcQuery();
query1.setDataConnection(conn1);
query1.setSqlQuery("select * from item");
```

Next, we declare each column the dataset will return, including the column name, order and type.
```
/* declare data columns */
DataColumn col1 = new DataColumn("Name", 0, DataType.STRING);
DataColumn col2 = new DataColumn("Description", 1, DataType.STRING);
DataColumn col3 = new DataColumn("Price", 2, DataType.DOUBLE);
```

Once the data columns are created, we need to associate them with a query. So we add each `DataColumn` to the query's list of columns.
```
/* add columns to the query */
query1.getColumns().add(col1);
query1.getColumns().add(col2);
query1.getColumns().add(col3);
```

Now that we have created the query, defined its connections and its columns we can add the query to the report:
```
/* add query to the report */
report.getDataQueries().add(query1);
```


# Design Data Table #
Now we are ready to define how the query results will be displayed in the report. We will do so in the form of a `DataTable`, which displays data in a column / row format.

We start by creating a `DataTable` which we then bind to the `DataQuery` we created in the previous step.
```
DataTable table = new DataTable();
table.setDataQuery(query1);
```

Next we create the table header row. Follow these steps:
  * Create a `GridRow` object
  * Add a `GridCell` to the row for each column in the data query
  * Add a `Label` to each cell. Provide each label w/ the appropriate column name
  * Finally add the row to the table's list of header rows

```
GridRow tableHeader = new GridRow();
tableHeader.addCell(new GridCell(new Label("Name")));
tableHeader.addCell(new GridCell(new Label("Description")));
tableHeader.addCell(new GridCell(new Label("Price")));
table.getHeaderRows().add(tableHeader);
```

Next we create the table body following these steps:
  * Create a `GridRow` object
  * Add a `GridCell` to the row for each column in the data query
  * Add a `DataElement` to each cell

Note how the `DataElement` expects a `DataColumn` in the constructor. By providing the `DataColumn` we bind the `DataElement` to the appropriate field from the query results. Notice that we do not re-create data columns... we provide the data columns created in the prior steps.
```
GridRow tableBody = new GridRow();
tableBody.addCell(new GridCell(new DataElement(col1, 0)));
tableBody.addCell(new GridCell(new DataElement(col2, 1)));
tableBody.addCell(new GridCell(new DataElement(col3, 2)));
table.getBodyRows().add(tableBody);
```

Now the table is created and fully bound to a data query. The final step is to add the `DataTable` to the `ReportDefinition`.
```
report.getWebPage().addChildElement(table);
```

Now when we run the report we will see an HTML table that displays the query columns and results.