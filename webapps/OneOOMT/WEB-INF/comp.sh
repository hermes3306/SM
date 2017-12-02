#!/bin/sh
CLASSPATH=./classes:./lib/servlet-api.jar
CLASSPATH="$CLASSPATH":./lib/httpclient-4.5.3.jar
CLASSPATH="$CLASSPATH":./lib/httpcore-4.4.6.jar
CLASSPATH="$CLASSPATH":./lib/commons-fileupload-1.3.3.jar

echo "CLASSPATH: $CLASSPATH"

javac -d ./classes -cp $CLASSPATH ./src/com/joonho/OneOOMT/*.java *.java
