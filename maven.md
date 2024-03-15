# Maven (from java-functional-programming)



[managing remote repositories](https://docs.github.com/en/get-started/getting-started-with-git/managing-remote-repositories#switching-remote-urls-from-https-to-ssh)


>Bootstrapping Application
1st, at intellij:

Start new Project at Intellij- New Project From VCS
		Url: "https://github.com/amigoscode/java-functional-programming.git"
		
2nd, create, same name project at our gitHub

3rd, locally, at our project directory:

**which git remote?**
```
git remote -v   
origin	https://github.com/amigoscode/java-functional-programming.git (fetch)
origin	https://github.com/amigoscode/java-functional-programming.git (push)
```
**remove origin!!**
```
git remote -v   
origin	https://github.com/amigoscode/java-functional-programming.git (fetch)
origin	https://github.com/amigoscode/java-functional-programming.git (push)
```
**add our new origin, to our github**
```
git remote add origin git@github.com:bullitjose/java-functional-programming.git
```
**add changes at local to origin, at github**
```
git push -u origin master

```
**download changes at github to local**
```
git pull origin master
```

## POM

A Project Object Model or POM is the fundamental unit of work in Maven. It is an XML file that contains information about the project and configuration details used by Maven to build the project.


## Maven repository

[repositori de maven](https://mvnrepository.com/)

**Usage of [javaFaker](https://mvnrepository.com/artifact/com.github.javafaker/javafaker/1.0.2): **
lesson 267

In pom.xml, add the following xml stanza between <dependencies> ... </dependencies>
```
<dependency>
    <groupId>com.github.javafaker</groupId>
    <artifactId>javafaker</artifactId>
    <version>1.0.2</version>
</dependency>
```


In your Java code
```
Faker faker = new Faker();

String name = faker.name().fullName(); // Miss Samanta Schmidt
String firstName = faker.name().firstName(); // Emory
String lastName = faker.name().lastName(); // Barton

String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
```


>Where is maven 
```
 casa@casa ~ cd .m2
 casa@casa  ~/.m2 ~ pwd
/home/casa/.m2

 casa@casa  ~/.m2  cd repository 
 casa@casa  ~/.m2/repository  

 casa@casa  ~/.m2/repository  ls
antlr                     commons-chain        demo     logkit
aopalliance               commons-cli          dk       mysql
asm                       commons-codec        dom4j    net
avalon-framework          commons-collections  eu       org
backport-util-concurrent  commons-digester     io       oro
ch                        commons-io           jakarta  sslext
classworlds               commons-lang         javax    xerces
com                       commons-logging      junit    xml-apis
commons-beanutils         commons-validator    log4j    xmlunit

```
dependencies of pom are at .m2/repository:
```
casa@casa  ~/.m2/repository  cd com       
 casa@casa  ~/.m2/repository/com  ls
datastax   github   h2database  openhtmltopdf  thoughtworks  zaxxer
dlsc       gluonhq  ibm         oracle         vaadin
fasterxml  google   jayway      sun            vladsch
 casa@casa  ~/.m2/repository/com  cd github
 casa@casa  ~/.m2/repository/com/github  ls
almasb  javafaker  mifmif
 casa@casa  ~/.m2/repository/com/github  cd javafaker                  
 casa@casa  ~/.m2/repository/com/github/javafaker  ls
javafaker
 casa@casa  ~/.m2/repository/com/github/javafaker  cd javafaker
 casa@casa  ~/.m2/repository/com/github/javafaker/javafaker  ls
1.0.2
 casa@casa  ~/.m2/repository/com/github/javafaker/javafaker  
```

>Maven build cicle(lesson 270)

[maven build cicle](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html)

A Build Lifecycle is Made Up of Phases. Each of these build lifecycles is defined by a different list of build phases, wherein a build phase represents a stage in the lifecycle.
For example, the default lifecycle comprises of the following phases (for a complete list of the lifecycle phases, refer to the Lifecycle Reference):
```
    validate - validate the project is correct and all necessary information is available
    compile - compile the source code of the project
    test - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
    package - take the compiled code and package it in its distributable format, such as a JAR.
    verify - run any checks on results of integration tests to ensure quality criteria are met
    install - install the package into the local repository, for use as a dependency in other projects locally
    deploy - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.
```

>package(lesson271)


