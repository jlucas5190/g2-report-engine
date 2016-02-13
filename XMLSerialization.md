# Introduction #

Most report engines choose to save their report definitions to XML for future use. This functionality is also provided by the `ReportSerializationUtil` class. A number of methods provide the ability to convert a `ReportDefinition` to xml and back.

# Java to XML #

In the [My First Report tutorial](MyFirstReport.md) we created a `ReportDefinition` object with a "Hello World" label. We could have easily saved this report to an XML file for future re-use.
```
ReportSerializationUtil.toXMLFile(new File("HelloWorld.xml"), report);
```

We could also have saved this report as an XML string for easy storage in a database, for example.
```
String xml = ReportSerializationUtil.toXMLString(report);
```

When the `ReportDefinition` is converted to XML it looks something like this:
```
<com.googlecode.g2re.domain.ReportDefinition>
  <name>My First Report</name>
  <created>2009-04-23 10:55:09.974 MST</created>
  <updated>2009-04-23 10:55:09.974 MST</updated>
  <dataConnections/>
  <reportParameters/>
  <dataQueries/>
  <htmlWebPage>
    <renderAsDiv>false</renderAsDiv>
    <childElements>
      <com.googlecode.g2re.html.Label>
        <value>Hello World!</value>
      </com.googlecode.g2re.html.Label>
    </childElements>
  </htmlWebPage>
</com.googlecode.g2re.domain.ReportDefinition>
```

# XML to Java #

Once a `ReportDefinition` has been persisted to XML, either a file or string, it is easy to convert it back
```
/* Get report definition from XML file */
ReportDefinition report = ReportSerializationUtil.fromXMLFile(new File("HelloWorld.xml"));

/* Get report definition from XML string */
ReportDefinition report = ReportSerializationUtil.fromXMLString("<xml ...");
```

Of course, you typically don't need worry about converting your report from XML to a `ReportDefinition`. This is handled by the `HTMLReportBuilder` and `ExcelReportBuilder` facades, which attempt to hide the complexities for report generation from the developer.