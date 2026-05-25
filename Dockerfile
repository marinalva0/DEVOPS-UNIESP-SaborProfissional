# Etapa 1: Build da aplicação (usa o Maven para compilar o código)
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: Execução (usa uma imagem leve do Java para rodar o .jar)
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# Copia o arquivo .jar gerado na etapa de build para a pasta de execução
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]