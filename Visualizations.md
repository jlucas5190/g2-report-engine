# Introduction #

G2 Report Engine support charts and visualizations on your HTML reports, using the [Google Visualization API](http://code.google.com/apis/visualization/documentation/gallery.html). The following Google Visualizations are currently supported:
  * Bar Chart [![](http://en.wikipedia.org/skins-1.5/monobook/external.png)](http://code.google.com/apis/visualization/documentation/gallery/barchart.html)
  * Column Chart [![](http://en.wikipedia.org/skins-1.5/monobook/external.png)](http://code.google.com/apis/visualization/documentation/gallery/columnchart.html)
  * Pie Chart [![](http://en.wikipedia.org/skins-1.5/monobook/external.png)](http://code.google.com/apis/visualization/documentation/gallery/piechart.html)
  * Map [![](http://en.wikipedia.org/skins-1.5/monobook/external.png)](http://code.google.com/apis/visualization/documentation/gallery/map.html)
  * GeoMap [![](http://en.wikipedia.org/skins-1.5/monobook/external.png)](http://code.google.com/apis/visualization/documentation/gallery/geomap.html)
  * Intensity Map
  * Gauge
  * Annotated Timeline (needs more testing)
  * Motion Chart (needs more testing)

## Bar / Column Charts ##
_coming soon_

## Pie Chart ##
_coming soon_

## Google Map ##

Adding data-bound maps to your HTML report is fairly simple. You will create a new `Map` object, bind it to a `DataQuery` (`JdbcQuery` or `AppEngineQuery` implementation) and bind to the appropriate data query columns.

```
Map map = new Map();
map.setDataQuery(query);
map.setDescriptionColumn(column1);
map.setAddressColumn(column2);
report.getWebPage().addChildElement(map);
```

The `setAdderessColumn` method is bound to a String column that contains an address. This address should be as complete as you can make it. The `setDescriptionColumn` is bound to a String column that describes the location in the address column.

The report type can also be set to Normal, Satellite or Hybrid

```
map.setMapType(MapType.hybrid);
```

## Geo Map ##

The `GeoMap` is very similar to using the `Map` component. The difference is that a `Geomap` displays values as a color-scale on the map. See the following example:
<br />
![http://www.google.com/ig/modules/geomap-thm.png](http://www.google.com/ig/modules/geomap-thm.png)

The following is a code snippet using the `GeoMap`:

```
GeoMap map = new GeoMap();
map.setDataQuery(query);
map.setDescriptionColumn(column1);
map.setAddressColumn(column2);
map.setValueColumn(column3);
report.getWebPage().addChildElement(map);
```

The required inputs are the following
  * AddressColumn: Address, country name, or region name locations. The following formats are accepted:
    * A specific address (for example, "1600 Pennsylvania Ave").
    * A country name as a string (for example, "England"), or an uppercase ISO-3166 code or its English text equivalent (for example, "GB" or "United Kingdom").
    * An uppercase ISO-3166-2 region code name or its English text equivalent (for example, "US-NJ" or "New Jersey"). Note: Regions can only be specified when the dataMode option is set to 'regions'.
  * ValueColumn: A numeric value displayed when the user hovers over this region. If column 3 is used, this column is required.
  * DescriptionColumn: Additional string text displayed when the user hovers over this region.

## Gauge ##
_coming soon_

## Annotated Timeline ##
_coming soon_

## Motion Chart ##
_coming soon_