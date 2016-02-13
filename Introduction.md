# About #

The g2 Report Engine is an open source reporting framework that integrates with your Java/J2EE application to produce reports. The project focuses on creating a simple, easy to use API that implements the majority of required reporting features.

A report can be executed directly from Java in 1 line of code... it doesn't get any easier!
```
HTMLReportBuilder.build(inputFile,params,outputFile);
```

Why another reporting engine, you ask? I need a reporting engine that can ultimately live inside Google App Engine (GAE) or any other "restricted" platform that I may choose. Rather that wait around for the possibility of an existing project to support GAE I thought I would build my own. As of 5/21 I have added some basic support for JDO-based App Engine queries, see the [App Engine Support](AppEngineSupport.md) section.

The only down side to building your own Reporting Engine is having to create a GUI report designer... if you have any suggestions for this let me know!

# Features #

Key features currently supported:
  * Tabular display of data. Including sorting, grouping and filtering
  * Charts, maps and visualizations (using Google APIs)
  * Custom scripting using javascript
  * Report parameters allow user input, customization
  * Supports multiple formats including HTML, PDF (**New**) and Excel
  * Command line support
  * Servlet support

# Road Map #

The following features are planned for future releases:
  * Aggregations when grouping data rows
  * Pivot table components
  * Improve scripting capabilities
  * Add PDF format (Complete and in Trunk)
  * Google App Engine support ([in-progress](AppEngineSupport.md))
  * UI for building reports (Eclipse or Netbeans RCP?)