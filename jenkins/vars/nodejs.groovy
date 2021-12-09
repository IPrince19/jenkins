stage('Code Quality') {
    steps {
        sh """
mvn clean verify sonar:sonar -Dsonar.projectKey=demoapp-project -Dsonar.host.url=http://44.237.30.63:9000 -Dsonar.login=c07b0b5bd58bb2c1b8768e2d6339dadfd4e77894
       """
    }
}


