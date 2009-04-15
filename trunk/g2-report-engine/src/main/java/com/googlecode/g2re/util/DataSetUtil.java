package com.googlecode.g2re.util;

import com.googlecode.g2re.filter.Filter;
import com.googlecode.g2re.jdbc.DataSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Brad Rydzewski
 */
public class DataSetUtil {

    public static DataSet getFilteredDataSet(DataSet ds, List<Filter> filters) {
        
        //exit method if no filters exist, returning original dataset
        if(filters==null || filters.isEmpty()==true)
            return ds;
        
        //initialize all data filters
        for(Filter f : filters) {
            f.init(ds);
        }
        
        //create new data set to hold filtered data
        DataSet filteredDataSet = new DataSet();
        filteredDataSet.setColumnNames(ds.getColumnNames());
        filteredDataSet.setColumnTypes(ds.getColumnTypes());
        List rows = new ArrayList();
        
        for(Object o : ds.getRows()) {

            //cast to row
            Object[] row = (Object[])o;
            
            //we need to see if row matches filter criteria
            boolean isMatch = true;
            
            for(Filter f : filters) {
                isMatch = f.isMatch(row);
                if(isMatch==false)break;
            }

            if(isMatch)
                rows.add(row);
        }
            
        //add rows to dataSet
        filteredDataSet.setRows(rows);
        
        return filteredDataSet;
    }
}
