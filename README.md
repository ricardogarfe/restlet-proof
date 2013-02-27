Restlef Proof Project
=======================

Proof of concept to create a Restlet application.

[Restlet Framework](http://restlet.org/)

## Requirements

* Java JDK 1.7 
* Maven 3.x 

## Launch

Three types of application:
  * `StandAloneServer.java`: Hello World Application (Get, Post, Put without functionality)
    ```shell
    $ javac -classpath RESTLET_HOME/lib/org.restlet.jar StandAloneServer.java
    $ java -classpath RESTLET_HOME/lib/org.restlet.jar StandAloneServer.java
    ```
  * `FirstStepsApplication.java` : Hello World Application using ServerResourcess for Get.
    ```shell
    $ javac \
    -classpath RESTLET_HOME/lib/org.restlet/2.0.15/org.restlet-2.0.15.jar:\
    RESTLET_HOME/lib/org.restlet.ext.json-2.0.15.jar:\
    RESTLET_HOME/lib/org.restlet.ext.simple-2.0.15.jar:RESTLET_HOME/lib/org.restlet.lib.org.json-2.0.jar \
    es.proof.restlet.standalone.application.FirstStepsApplication
    $ java \
    -classpath RESTLET_HOME/lib/org.restlet/2.0.15/org.restlet-2.0.15.jar:\
    RESTLET_HOME/lib/org.restlet.ext.json-2.0.15.jar:\
    RESTLET_HOME/lib/org.restlet.ext.simple-2.0.15.jar:RESTLET_HOME/lib/org.restlet.lib.org.json-2.0.jar \
    es.proof.restlet.standalone.application.FirstStepsApplication
    ```
  * `FirstResourceApplication.java` : Application using Get, Post and Put handling ServerResources.
    ```shell
    $ javac \
    -classpath RESTLET_HOME/lib/org.restlet/2.0.15/org.restlet-2.0.15.jar:\
    RESTLET_HOME/lib/org.restlet.ext.json-2.0.15.jar:\
    RESTLET_HOME/lib/org.restlet.ext.simple-2.0.15.jar:RESTLET_HOME/lib/org.restlet.lib.org.json-2.0.jar \
    es.proof.restlet.standalone.application.FirstResourceApplication
    $ java \
    -classpath RESTLET_HOME/lib/org.restlet/2.0.15/org.restlet-2.0.15.jar:\
    RESTLET_HOME/lib/org.restlet.ext.json-2.0.15.jar:\
    RESTLET_HOME/lib/org.restlet.ext.simple-2.0.15.jar:RESTLET_HOME/lib/org.restlet.lib.org.json-2.0.jar \
    es.proof.restlet.standalone.application.FirstResourceApplication
    ```

### Maven Jetty

Using maven command to launch war jetty application:

```shell
$ mvn clean jetty:run-war -Dmaven.test.skip=true
```

Go to `http://localhost:8080/firstResource/` and test Get REST service.

## Test

### Hello World Standalone

* GET 
```shell
$ curl -i -H "Accept: application/json" http://localhost:8182/ 
```

* POST
```shell
$ curl -i -H "Accept: application/json" -X POST http://localhost:8182/ 
```

* PUT
```shell
$ curl -i -H "Accept: application/json" -X PUT http://localhost:8182/ 
```

* DELETE
```shell
$ curl -i -H "Accept: application/json" -X DELETE http://localhost:8182/ 
```

### Hello World First Steps into Restlet JSON

* GET 
```shell
$ curl -i -H "Accept: application/json" http://localhost:8182/firstSteps/hello
```

* POST
```shell
$ curl -i -H "Accept: application/json" -X POST http://localhost:8182/firstSteps/hello
```

* PUT
```shell
$ curl -i -H "Accept: application/json" -X PUT http://localhost:8182/firstSteps/hello
```

* DELETE
```shell
$ curl -i -H "Accept: application/json" -X DELETE http://localhost:8182/firstSteps/hello
```

### First Item Resources with Restlet XML

Launch `FirstResourceServerMain.java` and test using `FirstResourceClientMain.java`.

**TODO:** Convert to Unit Test.

## Tutorials

Some tutorials about Restlet applications and first steps:

  * [Hello world simple tutorial](http://www.josesandoval.com/2009/06/restlet-20-sample-application-with.html) by Jose Sandoval.
  * [Official tutorial](http://restlet.org/learn/2.0/firstSteps) from restlet.org.
  * [Firs Resource tutorial](http://restlet.org/learn/2.0/firstResource) - Hello World ttorial using Resources. 

## Guide

[Restlet framework guide](http://restlet.org/learn/guide/2.1/#/13-restlet/27-restlet.html)

