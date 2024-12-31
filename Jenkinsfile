pipeline {
    agent any
    tools {
        maven 'maven_3_9_9' 
    }
    stages {
        stage('Checkout Code') {
            steps {
               checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/thinhtran383/RAG4j']])
            }
        }
        stage('Build Maven Project') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}
