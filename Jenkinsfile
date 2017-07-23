#!/usr/bin/env groovy

node {

    // add maven to path
    env.PATH = "${tool 'maven-3.5'}/bin:${env.PATH}"

    stage('checkout') {
        checkout scm
    }

    stage('check java') {
        sh "java -version"
    }

    stage('check maven') {
        sh "mvn -v"
    }

    stage('automation tests') {

        //run your build
        sh 'mvn clean verify -Pprod -Dwebdriver=phantomjs'
        //generate cucumber reports
        cucumber '**/*.json'

    }




}