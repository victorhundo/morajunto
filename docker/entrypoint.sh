#!/bin/bash

# Wait Mongo is Ready!
until curl -sL -w "%{http_code} %{url_effective}\\n" mongo:27017 >> /dev/null; do
  sleep 5
done

#Run Spring Boot
mvn spring-boot:run
