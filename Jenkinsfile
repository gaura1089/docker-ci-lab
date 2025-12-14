pipeline {
    agent any
    tools {
        maven "mymaven"
    }
    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/gaura1089/docker-ci-lab.git'
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
