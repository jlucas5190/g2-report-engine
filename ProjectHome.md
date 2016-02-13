The g2 Report Engine is an open source reporting framework that integrates with your Java/J2EE application to produce reports. In addition to basic reports, the G2 Report Engine also support charting, visualizations, maps, excel export, **dashboards** and more.

<u>Recent Updates</u>
<li><b>6/05</b>: Basic PDF support added</li>
<li><b>5/21</b>: Now supports basic JDO queries on Goole App Engine</li>

**![http://g2-report-engine.googlecode.com/svn/wiki/dashboard-screenshot.png](http://g2-report-engine.googlecode.com/svn/wiki/dashboard-screenshot.png)**

## API Integration ##

Similar to many existing solutions, reports are defined and then persisted to XML. Using a simple API the report definition XML can be processed to generate a business intelligence report in various formats (HTML, Excel).

The following code block demonstrates generating a basic HTML report with user input:

```
File inputFile = new File("PetLocationReport.rxml"); //xml definition of report
File outputFile = new File("PetLocationReport.html"); //html output
Maps params = new HashMap(); //user input parameters
params.put("category","dog");

HTMLReportBuilder.build(inputFile,params,outputFile);
```

## Servlet Integration ##

The project focuses primarily on the report engine API, however, we also provide a simple command line utility as well as a Servlet for generating reports within a web application. The Servlet is included in the report engine's jar, allowing you to easily add web-based reporting to you application with a single entry to its web.xml file.

For more details, see the [Servlet Integration](http://code.google.com/p/g2-report-engine/wiki/ServletIntegration) article.

_NOTE: project is still in beta status... ideas and contributions are welcome._