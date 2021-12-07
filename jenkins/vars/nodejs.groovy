stage('Code Quality') {
    steps {
        sh """
sonar-scanner -Dsonar.projectKey=sample -Dsonar.sources=. -Dsonar.host.url=http://172.31.7.240:9000 -Dsonar.login=c07b0b5bd58bb2c1b8768e2d6339dadfd4e77894
       """
    }
}