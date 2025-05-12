pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/imagine3794/NBE_Selenium.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean test'
            }
        }
        stage('Generate Allure Report') {
            steps {
                sh 'allure generate ./allure-results --clean --single-file -o ./allure-report'
            }
        }
        stage('Publish Report') {
            steps {
                archiveArtifacts artifacts: 'allure-report/**', fingerprint: true
            }
        }
    }
}
