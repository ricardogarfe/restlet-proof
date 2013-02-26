Restlef Proof Project
=======================

Proof of concept to create a Restlet application.

[Restlet Framework](http://restlet.org/)

Requirements
=============

* JDK 1.7* 
* Restlet libraries in bin folder: 
    * org.restlet 2.0.15
    * org.restlet.json.simple - 2.0.15
    * org.restlet.ext.simple - 2.0.15
    * org.restlet.lib.org.json - 2.0

Launch
=======

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

Tutorials
==========

Some tutorials about Restlet applications and first steps:

  * [Official tutorial](http://restlet.org/learn/2.0/firstSteps) from restlet.org.
  * [Hello world simple tutorial](http://www.josesandoval.com/2009/06/restlet-20-sample-application-with.html) by Jose Sandoval.
