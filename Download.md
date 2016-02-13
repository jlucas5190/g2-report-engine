Get the g2 Report Engine via maven by adding the following to your POM
```
<dependency>
  <groupId>com.googlecode.g2re</groupId>
  <artifactId>g2-report-engine</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```

Then you need to tell maven where to go to get the jar g2 report engine, since it is not yet available in one of the major public repositories. Add the following repository to your POM file:
```
<project>
  ...
  <repositories>
    <repository>
      <id>my-internal-site</id>
      <url>http://g2-report-engine.googlecode.com/svn/m2</url>
    </repository>
  </repositories>
  ...
</project>
```


If you do not use Maven you can also get copy from the [download page](http://code.google.com/p/g2-report-engine/downloads/list).

Note: if you are not using Maven please ensure you include all necessary dependencies in your project. A list of dependencies can be found [here](Dependencies.md).