pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                catchError(buildResult: 'FAILURE', stageResult: 'FAILURE') {
                    bat 'mvn clean test'
                }
            }
        }
        stage('Generate Allure Report') {
            steps {
                catchError(buildResult: 'FAILURE', stageResult: 'FAILURE') {
                    bat 'allure generate target/allure-results --clean --single-file -o ./allure-report'
                }
            }
        }
        stage('Publish Report') {
            steps {
                publishHTML(target: [
                    reportDir: './allure-report',
                    reportFiles: 'index.html',
                    keepAll: true,
                    alwaysLinkToLastBuild: true,
                    allowMissing: false
                ])
            }
        }
    }
}
