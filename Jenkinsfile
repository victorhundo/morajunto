pipeline {
  agent { docker { image 'maven:3.3.3' } }
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
