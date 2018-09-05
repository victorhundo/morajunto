pipeline {
  agent { docker { image 'maven:latest' } }
  stages {
    stage('build') {
      steps {
        script{
          sh 'mvn --version'
        }
      }
    }
  }
}
