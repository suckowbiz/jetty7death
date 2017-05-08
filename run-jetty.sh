#!/usr/bin/env bash

docker run --rm --name jetty --publish 8080:8080 --detach jetty:7-jre8