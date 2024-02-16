FROM eclipse-temurin:17
COPY target/auto.jar auto.jar
CMD ["java","-jar","auto.jar"]


