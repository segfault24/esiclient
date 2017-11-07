#!/bin/sh

cd `dirname "$0"`
base=`pwd`

jar=swagger-codegen-cli-2.2.2.jar
url=https://esi.tech.ccp.is/latest/swagger.json?datasource=tranquility
cfg=esi.swaggergen.config
out=EsiClient

# clean previous build
cd $base
rm -rf $out
rm -rf docs/

# generate source
java -jar $jar generate -i $url -l java -c $cfg -o $out

# compile to jar and generate docs
cd $out
mvn package
cp target/esi-client*.jar $base/release/
cp -r docs/ $base/

