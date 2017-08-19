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
        sh './mvnw clean verify -Pprod -Dwebdriver=phantomjs'
        //generate cucumber reports
        cucumber '**/*.json'

    }




}
