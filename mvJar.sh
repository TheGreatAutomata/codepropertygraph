VERSION="1812-606baacf+20240401-2057"

chmod -R a+w /home/noisy/.cache/coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph_3/1.6.6/
chmod -R a+w /home/noisy/.cache/coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph-protos_3/1.6.6/
chmod -R a+w /home/noisy/.cache/coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph-domain-classes_3/1.6.6/

cp codepropertygraph/target/scala-3.3.1/codepropertygraph_3-0.0.0+$VERSION.jar /home/noisy/.cache/coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph_3/1.6.6/codepropertygraph_3-1.6.6.jar
cp codepropertygraph/target/scala-3.3.1/codepropertygraph_3-0.0.0+$VERSION-javadoc.jar /home/noisy/.cache/coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph_3/1.6.6/codepropertygraph_3-1.6.6-javadoc.jar
cp codepropertygraph/target/scala-3.3.1/codepropertygraph_3-0.0.0+$VERSION-sources.jar /home/noisy/.cache/coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph_3/1.6.6/codepropertygraph_3-1.6.6-sources.jar

cp domainClasses/target/scala-3.3.1/codepropertygraph-domain-classes_3-0.0.0+$VERSION.jar  /home/noisy/.cache/coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph-domain-classes_3/1.6.6/codepropertygraph-domain-classes_3-1.6.6.jar
cp domainClasses/target/scala-3.3.1/codepropertygraph-domain-classes_3-0.0.0+$VERSION-javadoc.jar  /home/noisy/.cache/coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph-domain-classes_3/1.6.6/codepropertygraph-domain-classes_3-1.6.6-javadoc.jar
cp domainClasses/target/scala-3.3.1/codepropertygraph-domain-classes_3-0.0.0+$VERSION-sources.jar  /home/noisy/.cache/coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph-domain-classes_3/1.6.6/codepropertygraph-domain-classes_3-1.6.6-sources.jar

cp proto-bindings/target/scala-3.3.1/codepropertygraph-protos_3-0.0.0+$VERSION.jar /home/noisy/.cache/coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph-protos_3/1.6.6/codepropertygraph-protos_3-1.6.6.jar
cp proto-bindings/target/scala-3.3.1/codepropertygraph-protos_3-0.0.0+$VERSION-javadoc.jar /home/noisy/.cache/coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph-protos_3/1.6.6/codepropertygraph-protos_3-1.6.6-javadoc.jar
cp proto-bindings/target/scala-3.3.1/codepropertygraph-protos_3-0.0.0+$VERSION-sources.jar /home/noisy/.cache/coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph-protos_3/1.6.6/codepropertygraph-protos_3-1.6.6-sources.jar

cp proto-bindings/target/protobuf_external/cpg.proto /home/noisy/codeDigitization/clangPart/src/protobuf/cpg.proto
protoc --proto_path=/home/noisy/codeDigitization/clangPart/src/protobuf/ /home/noisy/codeDigitization/clangPart/src/protobuf/cpg.proto --cpp_out=/home/noisy/codeDigitization/clangPart/src/protobuf/
mv /home/noisy/codeDigitization/clangPart/src/protobuf/cpg.pb.cc /home/noisy/codeDigitization/clangPart/src/protobuf/src/cpg.pb.cc
mv /home/noisy/codeDigitization/clangPart/src/protobuf/cpg.pb.h /home/noisy/codeDigitization/clangPart/src/protobuf/include/cpg.pb.h

chmod -R a-w /home/noisy/.cache/coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph_3/1.6.6/
chmod -R a-w /home/noisy/.cache/coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph-protos_3/1.6.6/
chmod -R a-w /home/noisy/.cache/coursier/v1/https/repo1.maven.org/maven2/io/shiftleft/codepropertygraph-domain-classes_3/1.6.6/

#cp schema/target/scala-3.3.1/codepropertygraph-schema_3-0.0.0+1811-7aeb8ca1+-1854.jar ../modified_codepropertygraph_schema_3.jar
