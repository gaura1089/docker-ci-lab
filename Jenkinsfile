pipeline {
  agent any
  tools {
    maven 'mymaven'
  }

  stages {
    stage('Checkout Code') {
      steps {
        git branch: 'main', url: 'https://github.com/gaura1089/docker-ci-lab.git'
      }
    }

    stage('Maven Build') {
      steps {
        sh 'mvn -q clean package'
        sh 'ls -l target/'
      }
    }

    stage('Docker Build') {
      steps {
        sh '''
          docker version
          docker build -t docker-ci-app:v1 .
        '''
      }
    }

    stage('Docker Run') {
      steps {
        sh '''
         
          docker run -d --name docker-ci -p 9090:8080 docker-ci-app:v1
          docker ps
        '''
      }
    }
  }
}
