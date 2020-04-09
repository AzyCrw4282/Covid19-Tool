call clean
java -jar ../lib/art.jar  HelpMeWithCovid19.art
javac -classpath .;../lib/art.jar;.;../lib/jfreechart-1.5.0.jar;.;../lib/jcommon-1.0.23.jar;.;../lib/java-json.jar; ARTGeneratedParser.java ARTGeneratedLexer.java CovidMain.java
java -classpath .;../lib/art.jar;.;../lib/jfreechart-1.5.0.jar;.;../lib/jcommon-1.0.23.jar;.;../lib/java-json.jar; ARTTest HelpMeWithCovid19.str +phaseAG