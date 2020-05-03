pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                withMaven(maven:'local_maven'){
                    sh 'mvn clean compile'
                }
            }
        }
        stage('Test') {
            steps {
                withMaven(maven:'local_maven'){
                   sh 'mvn test'
                   }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}