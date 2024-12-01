#!/bin/sh

# get the dependency tree for the apps
mvn dependency:tree

# ways to clean...
../mvnw clean spring-boot:run

# clean and make a jar
mvn clean package

# bog standard get
http://localhost:8080/greeting

# get with a query param
http://localhost:8080/greeting?name=Mac

# a get that has CORS capability on path
http://localhost:8080/greeting-javaconfig

# send a POST request
curl -i -H "Accept: application/json" -H "Content-Type:application/json" -X POST --data '{"username": "davek", "password": "topsecret"}' "http://localhost:8080/echo"

echo
