# quarkus-metrics

This project is a small proof-of-concept that demonstrates how to address the following requirements:
- Log all methods before and after its execution using an interceptor;
- Generate JVM metrics and consume them using Prometheus, Graphana and JVM (Micrometer) dashboard;
- Use Sun's Java checkstyle with some minor adjustments;
- Generate jacoco reports and display them using SonarQube.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
mvn compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
mvn package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

If you want to build an _über-jar_, execute the following command:
```shell script
mvn package -Dquarkus.package.type=uber-jar
```

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

## Run Prometheus and Graphana

You can run your infrastructure using:
```shell script
docker-compose up -d
```

## Display JVM (Micrometer) dashboard:

After running Prometheus and Graphana, configure Prometheus as one of Graphana's data sources and import the following dashboard:
https://grafana.com/grafana/dashboards/4701

<p align="center"><img width="100%" src="https://lh3.googleusercontent.com/n65r0I_9jAVs73mLoNh9MLK8rPtyUkH7sP0RelC86aZpiZrHwr9SHc-6azGxiAkHCyns-cQuLR45UpNqUvxMyuXs50wI0gXxMasFQnfUPk8DWUErWAJSEEo43NJe8-y5_ex8YNJt0w=w2400?source=screenshot.guru"/></p>
