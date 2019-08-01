# javadoc-test
Maven test for Javadoc 11

While `mvn site` does not work `mvn package site`will work but test-javadoc will still fail.

`mvn javadoc:javadoc` also fails while `mvn compile javadoc:javadoc` won't.

This only happens with maven-javadoc version 3.1.0 and 3.1.1
