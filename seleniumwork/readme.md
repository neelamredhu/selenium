###Selenium


* This is a maven project which contains Selenium test case for below user story

**As a Xero User, In order to manage my business successfully, I want to be able to add an “ANZ (NZ)” bank account inside any Xero Organisation.**

####Prerequisite 
     * Windows
     * Java is installed
     * Maven is installed and is in added into Path environment variable
 
#### Steps to run the test case

* Clone the 

* Below dependencies need to be included in Maven project.

```xml
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>3.141.59</version>
</dependency>

<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-chrome-driver</artifactId>
    <version>3.141.59</version>
</dependency>


<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>6.14.3</version>
    <scope>test</scope>
</dependency>

```