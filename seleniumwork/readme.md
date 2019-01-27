###Selenium


* This is a maven project which contains Selenium test case for below user story

**As a Xero User, In order to manage my business successfully, I want to be able to add an “ANZ (NZ)” bank account inside any Xero Organisation.**

####Prerequisite 
     * Windows
     * Java is installed
     * Maven is installed and is in added into Path environment variable
 
#### Steps to run the test case

Step 1: Clone the Git repository

```
	git clone https://github.com/neelamredhu/selenium.git
```
Step 2: Go to the seleniumwork folder 

```
cd seleniumwork

```

Step 3: Run maven clean compile to clean the maven project and compile it

```
	mvn clean compile
```

Step 4: Then run maven test goal

```
	mvn test
```

Step 5: Test report can be found at below location

```
	<your location>\seleniumwork\target\surefire-reports\index.html
```