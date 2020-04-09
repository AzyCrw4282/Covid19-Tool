@echo off
call clean
java -jar ../art.jar %1.art 
javac -classpath .;../art.jar ARTGeneratedParser.java ARTGeneratedLexer.java ARTAssB.java
java -classpath .;../art.jar ARTAssB %1.str %2 %3 %4 %5 %6 %7 %8 %9
