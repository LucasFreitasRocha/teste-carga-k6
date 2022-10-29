FROM openjdk:11.0.16-jdk
RUN addgroup --system spring && adduser --system spring -ingroup spring
USER spring:spring
ADD target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
