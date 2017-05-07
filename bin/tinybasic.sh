#!/bin/bash

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
java -jar $DIR/../target/tinybasic-0.0.1-jar-with-dependencies.jar $@
exit $?
