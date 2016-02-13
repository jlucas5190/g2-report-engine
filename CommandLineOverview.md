# Overview #

The g2 report engine includes support for basic command line execution, including the following features:
  * Generate HTML report
  * Generate Excel report
  * Show report parameters
  * View Help menu


# Generating Reports #

The basic command for generating a report is the following:
```
java -jar g2-report-engine.jar -in "HelloWorld.xml" -out "HelloWorld.html"
```

Note the following parameters used in the above command:
  * `-in` is the path of the XML report definition file
  * `-out` is the fie path where the report results are generated

By default, all reports will be generated in HTML format, however, you can specify other formats via the `-format` parameter, whose accepted values are `html` and `excel`.

Here is an example of the Hello World report in excel format:
```
java -jar g2-report-engine.jar -in "HelloWorld.xml" -out "HelloWorld.html" -format:excel
```