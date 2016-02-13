# Introduction #

The report engine JAR includes a servlet providing web-based reporting. This can easily be integrated into an application by mapping the servlet in its web.xml.

# Servlet Setup #

The g2 report engine library includes a `ServletDispatcher` that will receive and process requests to provide web-based reporting capabilities. You will need to add this to the project's web.xml.

```
    <servlet>
        <servlet-name>report-servlet</servlet-name>
        <servlet-class>com.googlecode.g2re.servlet.ServletDispatcher</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>report-servlet</servlet-name>
        <url-pattern>/ReportViewer.htm</url-pattern>
    </servlet-mapping>
```

# Report URL and Params #

You can now run the project and generate your reports using the following URL:
http://localhost:8084/ReportViewer.htm

You will need to provide the page with 2 parameters:
  1. report=path/and/name/of/report/xml
  1. view=input
_Example:_ http://localhost:8084/ReportViewer.htm?view=input&report=c:\PetLocationReport.rxml

# Screenshots #

This is an example of the user input screen where the user can provide their own input parameters for the report. This page is dynamically generated based on the report definition file provided in the URL:
![http://g2-report-engine.googlecode.com/svn/docs/screenshot-user-input-thum.png](http://g2-report-engine.googlecode.com/svn/docs/screenshot-user-input-thum.png)

This is an example of an HTML generated report, once the user has provided the input parameters:
![http://g2-report-engine.googlecode.com/svn/docs/screenshot-report-html-thum.png](http://g2-report-engine.googlecode.com/svn/docs/screenshot-report-html-thum.png)