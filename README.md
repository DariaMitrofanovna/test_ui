# Global Network Standards and Audits

### Startup process:
(\*...* mean your info)

##### 0. The following components must be installed:
  - Java Development Kit
  - IntelliJ IDEA Ultimate with lombok plugin
  - Node.js
  - Git
#####  1. Сlone project repository
##### 2. Checkout *dev* branch
##### 3. Start db infrastructure locally in docker. In Terminal in IntelliJ IDEA from *gnsa-sm-am* folder:
`docker-compose up`

##### 4. Add PostgreSQL Data Source in tab *Database* in IntelliJ IDEA
##### 5. Compile project
In Terminal in IntelliJ IDEA from *gnsa-sm-am* folder:
`$ mvn clean install -P UI`
##### 5.1. Compile project when ui is not changed
`$ mvn clean install`
##### 5.2. Compile project when ui is not changed
Press green button in Application.java class
##### 6. Run project
In Terminal in IntelliJ IDEA from *sm-app* folder:
`$ mvn spring-boot:run`
##### 7. Open application
In browser go to:  *locallhost:8080/ui/#*

Username: *vanilla*

Password: *vanilla*
