# docker build -t spring-test .
# Usa una imagen base de Java
FROM eclipse-temurin:21.0.4_7-jre-noble

# Añade el jar del Spring Boot al contenedor
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Expone el puerto en el que corre la app
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java","-jar","/app.jar"]