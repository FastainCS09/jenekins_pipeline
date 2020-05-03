pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                withMaven(maven:'local_maven'){
                    bat 'mvn clean compile'
                }
            }
        }
        stage('Test') {
            steps {
                withMaven(maven:'local_maven'){
                   bat 'mvn test'
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