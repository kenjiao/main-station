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
        sh './mvnw clean verify -Dcucumber.options="--tags @web_login" -Dwebdriver=chrome -Dremote.hub=http://zalenium:4444/wd/hub'
        //generate cucumber reports
        cucumber '**/cucumber.json'

    }




}
