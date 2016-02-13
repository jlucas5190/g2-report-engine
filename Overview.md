The g2 Report Engine is an open source reporting framework that integrates with your Java/J2EE application to produce reports. The project focuses on creating a simple, easy to use API that implements the majority of required reporting features.

A report can be executed directly from Java in 1 line of code... it doesn't get any easier!
```
HTMLReportBuilder.build(inputFile,params,outputFile);
```

Why another reporting engine, you ask? I need a reporting engine that can ultimately live inside Google App Engine (GAE) or any other "restricted" platform that I may choose. Rather that wait around for the possibility of an existing project to support GAE I thought I would build my own. Of course, this only currently works with JDBC, but that is because I started building this months ago, before GAE/J existed, in hopes the Java language would be supported.

The only down side to building your own Reporting Engine is having to create a GUI report designer... if you have any suggestions for this let me know!

### Download ###

Get the g2 Report Engine via maven by adding the following to your POM
```
<dependency>
  <groupId>com.googlecode.g2re</groupId>
  <artifactId>g2-report-engine</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```

Or get a copy from the [download page](http://code.google.com/p/g2-report-engine/downloads/list)

### Features ###

Key features of the report engine include:
  * Tabular display of data. Including sorting, grouping and filtering
  * Charts, maps and visualizations (using Google APIs)
  * Custom scripting using javascript
  * Report parameters allow user input, customization
  * Supports multiple formats including HTML and Excel
  * Command line support
  * Servlet support

### Road Map ###

The following features are planned for future releases:
  * Aggregations when grouping data rows
  * Pivot table components
  * Improve scripting capabilities
  * Add PDF and Delimited formats
  * Google App Engine support
  * UI for building reports (Eclipse or Netbeans RCP?)