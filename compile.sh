#!/bin/sh

BASE=`pwd`

# disable doclint on the maven-javadoc-plugin by adding:
#  <configuration>
#    <additionalparam>-Xdoclint:none</additionalparam>
#  </configuration>

# compile to jar and generate docs
cd EsiClient
mvn package

if [ $0 ]; then
  cd $BASE
  rm -rf release/
  mkdir release/
  cp EsiClient/target/*.jar release/
  cp -r EsiClient/target/apidocs release/
fi
