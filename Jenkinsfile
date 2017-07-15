#!/usr/bin/env groovy

node {
    stage('checkout') {
        checkout scm
    }

    stage('check java') {
        sh "java -version"
    }

    stage('check maven') {
        sh "mvn -v"
    }

    stage('clean') {
        sh "mvn clean"
    }

    stage('automation tests') {
        try {
            sh "mvn verify -Pprod"
        } catch(err) {
            throw err
        } finally {
            junit '**/target/pretty/**'
            junit '**/target/reports/**'
            junit '**/target/surefire-reports/**'
        }
    }




}
