#!/bin/sh

# disable doclint on the maven-javadoc-plugin by adding:
#  <configuration>
#    <additionalparam>-Xdoclint:none</additionalparam>
#  </configuration>

# compile to jar and generate docs
cd EsiClient
mvn package
