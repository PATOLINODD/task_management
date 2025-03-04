FROM quay.io/quarkus/quarkus-micro-image:2.0

COPY target/my-quarkus-app-1.0.0-runner /application

EXPOSE 8080

CMD ["/application", "-Dquarkus.http.host=0.0.0.0"]
