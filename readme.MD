# Škoda Task

## Backend
Application is written using
- Java 17
- Spring Boot framework, version 3.3.4.
- Spring Doc, version 2.0.2
- Hibernate ORM
- Flyway
- PostgreSQL
- Stripe

## Local environment

### Application start
- To run the application: `docker compose up`, add ` -d` to run as `daemon`
- To stop the application: `docker compose down` 

### Application ports
- Backend is accessible on http://localhost:8080/api/v1/
- Swagger UI is accessible on http://localhost:8080/api/v1/swagger-ui.html
- Database is accessible on `localhost` port `5432`, credentials are in file `src/main/resources/application.properties` or `compose.yaml`

## Deployment & CI/CD
- Project is automatically deployed as an Azure Container App.
- Each push to the master branch is **automatically** deployed to the stage environment, pipeline for the production must be **manually** started.


![Description of Image](./docs/skoda-task.drawio.png)


### Stage
[Swagger UI - Stage](https://skoda-be-prod.livelyisland-54db95f6.westeurope.azurecontainerapps.io/api/v1/swagger-ui/index.html)

**DB:** `skoda-db-stage.postgres.database.azure.com`

### Production
[Swagger UI - Production](https://skoda-be-stage.gentlecliff-615a9455.westeurope.azurecontainerapps.io/api/v1/swagger-ui/index.html)

**DB:** `skoda-db-prod.postgres.database.azure.com`
