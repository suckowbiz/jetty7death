#!/usr/bin/env bash

docker run -it --rm --name mvn -v "$PWD":/opt -w /opt maven:3.2-jdk-8 mvn clean install
