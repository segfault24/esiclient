#!/bin/sh

cd `dirname "$0"`
base=`pwd`

jar=swagger-codegen-cli-2.2.2.jar
url=https://esi.evetech.net/_latest/swagger.json?datasource=tranquility
cfg=esi.swaggergen.config
out=EsiClient

# clean previous build
cd $base
rm -rf $out

# generate source
java -jar $jar generate -i $url -l java -c $cfg -o $out

