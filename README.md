Resful JSON Web Service
========================

* mvn clean install
* mvn tomcat:deploy 
* http://localhost:8080/rest/data/person?id=15


####Maven Deployment Tomcat Users: mvn tomcat:deploy 

```
vi ~/tomcat/conf/tomcat-users.xml

<role rolename="manager-gui"/>
<user password="manager" roles="manager-gui" username="manager"/>
<user password="admin" roles="manager-gui,manager-script,admin" username="admin"/>
```
