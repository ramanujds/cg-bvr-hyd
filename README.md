# capgemini-bvrit

Instructions for Spring Boot with JSP
1) Create a folder "webapp" inside src->main->webapp

2) Add Eclipse Java EE Tools from Help->EclipseMarketplace

3) Add Tomcat Jasper Dependency to pom.xml

# How add Oracle Depoendency to Maven Project

1) Download ojdbc6.jar
2) Download Maven - https://mirrors.estointernet.in/apache/maven/maven-3/3.6.3/source/apache-maven-3.6.3-src.zip
3) Run Command (CMD) : 
    mvn install:install-file -Dfile=[Path to ojdbc6.jar] -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0 -Dpackaging=jar
4) Add the following dependency to maven project (pom.xml)
        <dependency>
            <groupId>com.oracle</groupId>
            <artifactId>ojdbc6</artifactId>
            <version>11.2.0</version>
        </dependency>
        
# Steps for Spring-JPA Integration
1) Add JPA Starter Dependency to pom.xml
2) Add jdbc driver for oracle
3) Add jpa properties to application.properties 
4) Create Entity
5) Create Repository [DAO]
6) Create Service 
7) Create Controller/Create RestController
8) Create View
