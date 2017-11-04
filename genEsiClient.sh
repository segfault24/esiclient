#!/bin/sh

jar=swagger-codegen-cli-2.2.2.jar
url=https://esi.tech.ccp.is/latest/swagger.json?datasource=tranquility
cfg=esi.swaggergen.config
out=EsiClient

# clean previous build
rm -rf $out

# generate source
java -jar $jar generate -i $url -l java -c $cfg -o $out

# compile to jar
cd $out
mvn -Dmaven.javadoc.skip=true package
