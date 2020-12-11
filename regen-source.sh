#!/bin/sh

cd `dirname "$0"`

codegenver=2.2.2
jar=swagger-codegen-cli-${codegenver}.jar
url=https://esi.evetech.net/_latest/swagger.json?datasource=tranquility
cfg=esi.swaggergen.config
out=EsiClient

# get the jar
if [[ ! -r ${jar} ]]; then
  curl https://repo1.maven.org/maven2/io/swagger/swagger-codegen-cli/${codegenver}/${jar} --output ${jar}
fi

# generate source
rm -rf $out
java -jar $jar generate -i $url -l java -c $cfg -o $out

echo ""
echo "Need to manually add this to the pom.xml:"
echo "  <dependency>"
echo "    <groupId>javax.annotation</groupId>"
echo "    <artifactId>javax.annotation-api</artifactId>"
echo "    <version>1.3.2</version>"
echo "  </dependency>"
echo ""
echo "Configure maven-javadoc-plugin:"
echo "  <configuration>"
echo "    <source>8</source>"
echo "    <additionalparam>-Xdoclint:none</additionalparam>"
echo "  </configuration>"
echo ""
