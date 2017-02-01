FROM tomcat:8.0.20-jre8

ARG version

RUN echo Version is: $version
RUN echo File is: spring-boot-example-$version.war

COPY /target/spring-boot-example-$version.war /usr/local/tomcat/webapps/spring-boot-example-$version.war