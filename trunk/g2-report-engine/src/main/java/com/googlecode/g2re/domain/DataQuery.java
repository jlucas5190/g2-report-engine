package com.googlecode.g2re.domain;

import com.googlecode.g2re.filter.Filter;
import com.googlecode.g2re.jdbc.DataSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Abstract class representing a query of any data source, such as database,
 * CSV, Excel, POJO, etc.
 * TODO: Remove JdbcParameter list since it is specific to the JdbcQuery impl.
 * @author Brad Rydzewski
 */
public abstract class DataQuery {

    /**
     * The name of the data query.
     * @serial
     */
    private String name;
    /**
     * Columns in the data query result set.
     * @serial
     */
    private List columns = new ArrayList();
    /**
     * Input parameters used to build the data query.
     */
    private List<JdbcParameter> parameters = new ArrayList<JdbcParameter>();
    /**
     * Filters used to limit the data query's results.
     */
    private List<Filter> filters = new ArrayList<Filter>();

    /**
     * Gets the list of {@link DataColumn} objects defined in
     * this data query.
     * @return list of data columns.
     */
    public final List getColumns() {
        return columns;
    }

    /**
     * Sets the list of {@link DataColumn} objects in the dataset.
     * @param cols List of data columns.
     */
    public final void setColumns(final List cols) {
        this.columns = cols;
    }

    /**
     * Gets a list of parameters used to build a data query
     * (ie prepared statement).
     * @return list of data query parameters.
     */
    public final List<JdbcParameter> getParameters() {
        return parameters;
    }

    /**
     * Sets a list of parameters used to build a data query
     * (ie prepared statement).
     * @param params list of query parameters.
     */
    public final void setParameters(final List<JdbcParameter> params) {
        this.parameters = params;
    }

    /**
     * Gets the name of the data query.
     * @return query name.
     */
    public final String getName() {
        return name;
    }

    /**
     * Sets the name of the data query.
     * @param nm name of the query.
     */
    public final void setName(final String nm) {
        this.name = nm;
    }

    /**
     * Gets a list of filters that are applied to the data
     * query results to limit the data set.
     * @return list of filters.
     */
    public final List<Filter> getFilters() {
        return filters;
    }

    /**
     * Sets the list of Fitlers that should be applied to limit the data
     * set returned by this data query.
     * @param filtrs list of filters.
     */
    public final void setFilters(final List<Filter> filtrs) {
        this.filters = filtrs;
    }

    /**
     * Executes the data query and returns the results.
     * @return result set.
     */
    public abstract DataSet execute();
}
