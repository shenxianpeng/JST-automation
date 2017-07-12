# discoverQA Automation Frameworks
Java+Selenium+TestNG

**directory structure**

    .
    ├──discoverQA
    |   ├── src
    |   |   └── main
    |   |   |   └── java
    |   |   |   |   └── com
    |   |   |   |   |   └── action
    |   |   |   |   |   |   └── case01
    |   |   |   |   |   |   └── case02
    |   |   |   |   |   |   └── common
    |   |   |   |   |   |   └── .....
    |   |   |   |   |   └── config
    |   |   |   |   |   |   └── UserConfig
    |   |   |   |   |   |   └── DriverConfig
    |   |   |   |   |   |   └── UrlConfig
    |   |   |   |   |   |   └── ......
    |   |   |   |   |   └── page
    |   |   |   |   |   |   └── LoginPage
    |   |   |   |   |   |   └── HomePage
    |   |   |   |   |   |   └── ......
    |   |   |   |   |   └── verify
    |   |   |   |   |   |   └── case01
    |   |   |   |   |   |   └── case02
    |   |   |   |   |   |   └── ......
    |   └── testng.xml
    |   └── pom.xml
  
  
action: all test function write in this folder.<br />
config: all config file put in this folder.<br />
page: all page element write in this folder.<br />
verify: all verify test case write in this folder.<br />
testng.xml: test suit file, config all verify test case in this file.<br />
pom.xml: configuration need package files.
