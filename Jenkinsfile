#!/usr/bin/env groovy

node {

    stage('checkout') {
        checkout scm
    }

    stage('check java') {
        sh "java -version"
    }

    stage('check maven') {
        sh "./mvnw -v"
    }

    stage('automation tests') {

        //run your build
        sh './mvnw clean verify -Pprod -Dwebdriver=phantomjs -Dbinary.root.directory=/tmp/webdriver/root -Dbinary.zips.directory=/tmp/webdriver/zips'
        //generate cucumber reports
        cucumber '**/*.json'

    }




}
