#!/bin/bash

HOST=mongo
PORT=27017
# Wait Mongo is Ready!
until timeout 1 bash -c "cat < /dev/null > /dev/tcp/${HOST}/${PORT}" 2> /dev/null; do
      sleep 5
done

#Run Spring Boot
mvn spring-boot:run
