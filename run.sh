#!/bin/zsh

clientVersion=1
basePath=/Users/guyveraghtert/.m2/repository/be/veraghtert/tutorial/semver

java -cp $basePath/client/$clientVersion/client-$clientVersion.jar:$basePath/library/$1/library-$1.jar be.veraghtert.tutorial.semver.client.Main

