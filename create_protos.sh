#!/bin/bash
protoc --java_out=src/main/java/ --proto_path=src/main/resources/ src/main/resources/*
