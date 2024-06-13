VERSION="0.1+4-1a655e2a"

#/Users/liuhaokun/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph_3/1.6.6

chmod -R a+w /Users/liuhaokun/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph_3/1.6.6
chmod -R a+w /Users/liuhaokun/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph-protos_3/1.6.6/
chmod -R a+w /Users/liuhaokun/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph-domain-classes_3/1.6.6/

cp codepropertygraph/target/scala-3.3.1/codepropertygraph_3-$VERSION.jar /Users/liuhaokun/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph_3/1.6.6/codepropertygraph_3-1.6.6.jar
cp codepropertygraph/target/scala-3.3.1/codepropertygraph_3-$VERSION-javadoc.jar /Users/liuhaokun/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph_3/1.6.6/codepropertygraph_3-1.6.6-javadoc.jar
cp codepropertygraph/target/scala-3.3.1/codepropertygraph_3-$VERSION-sources.jar /Users/liuhaokun/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph_3/1.6.6/codepropertygraph_3-1.6.6-sources.jar

cp domainClasses/target/scala-3.3.1/codepropertygraph-domain-classes_3-$VERSION.jar  /Users/liuhaokun/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph-domain-classes_3/1.6.6/codepropertygraph-domain-classes_3-1.6.6.jar
cp domainClasses/target/scala-3.3.1/codepropertygraph-domain-classes_3-$VERSION-javadoc.jar  /Users/liuhaokun/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph-domain-classes_3/1.6.6/codepropertygraph-domain-classes_3-1.6.6-javadoc.jar
cp domainClasses/target/scala-3.3.1/codepropertygraph-domain-classes_3-$VERSION-sources.jar  /Users/liuhaokun/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph-domain-classes_3/1.6.6/codepropertygraph-domain-classes_3-1.6.6-sources.jar

cp proto-bindings/target/scala-3.3.1/codepropertygraph-protos_3-$VERSION.jar /Users/liuhaokun/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph-protos_3/1.6.6/codepropertygraph-protos_3-1.6.6.jar
cp proto-bindings/target/scala-3.3.1/codepropertygraph-protos_3-$VERSION-javadoc.jar /Users/liuhaokun/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph-protos_3/1.6.6/codepropertygraph-protos_3-1.6.6-javadoc.jar
cp proto-bindings/target/scala-3.3.1/codepropertygraph-protos_3-$VERSION-sources.jar /Users/liuhaokun/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph-protos_3/1.6.6/codepropertygraph-protos_3-1.6.6-sources.jar

cp proto-bindings/target/protobuf_external/cpg.proto /Users/liuhaokun/codeWorkspace/codeDigitization/clangPart/protobuf/cpg.proto
protoc --proto_path=/Users/liuhaokun/codeWorkspace/codeDigitization/clangPart/protobuf/ /Users/liuhaokun/codeWorkspace/codeDigitization/clangPart/protobuf/cpg.proto --cpp_out=/Users/liuhaokun/codeWorkspace/codeDigitization/clangPart/protobuf/
mv /Users/liuhaokun/codeWorkspace/codeDigitization/clangPart/protobuf/cpg.pb.cc /Users/liuhaokun/codeWorkspace/codeDigitization/clangPart/protobuf/src/cpg.pb.cc
mv /Users/liuhaokun/codeWorkspace/codeDigitization/clangPart/protobuf/cpg.pb.h /Users/liuhaokun/codeWorkspace/codeDigitization/clangPart/protobuf/include/cpg.pb.h

chmod -R a-w /Users/liuhaokun/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph_3/1.6.6/
chmod -R a-w /Users/liuhaokun/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph-protos_3/1.6.6/
chmod -R a-w /Users/liuhaokun/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph-domain-classes_3/1.6.6/

#cp schema/target/scala-3.3.1/codepropertygraph-schema_3-1811-7aeb8ca1+-1854.jar ../modified_codepropertygraph_schema_3.jar
