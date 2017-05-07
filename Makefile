ANTLR4 ?= java -jar /usr/local/lib/antlr-4.7-complete.jar
MVN ?= mvn
EXECJAR ?= target/tinybasic-0.0.1-jar-with-dependencies.jar

build:
	$(MVN) package

grammar:
	$(ANTLR4) TinyBasic.g4 -o src/com/hfernandes/tinybasic/generated -package com.hfernandes.tinybasic.generated

run-example:
	java -jar $(EXECJAR) fixtures/echo1.basic

