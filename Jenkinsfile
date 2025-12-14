pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                echo 'Code already present'
            }
        }

        stage('Maven Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t docker-ci-app:v1 .'
            }
        }

        stage('Docker Run') {
            steps {
                sh '''
                docker rm -f docker-ci || true
                docker run -d --name docker-ci docker-ci-app:v1
                '''
            }
        }
    }
}