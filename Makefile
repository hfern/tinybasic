ANTLR4 ?= java -jar /usr/local/lib/antlr-4.7-complete.jar
MVN ?= mvn

build:
	$(MVN) package

grammar:
	$(ANTLR4) TinyBasic.g4 -o src/com/hfernandes/tinybasic/generated -package com.hfernandes.tinybasic.generated

