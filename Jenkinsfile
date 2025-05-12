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
                bat 'mvn clean test'
            }
        }
        stage('Generate Allure Report') {
            steps {
                bat 'allure generate ./allure-results --single-file -o ./allure-report'
            }
        }
        stage('Publish Report') {
            steps {
                archiveArtifacts artifacts: 'allure-report/**', fingerprint: true
            }
        }
    }
}
