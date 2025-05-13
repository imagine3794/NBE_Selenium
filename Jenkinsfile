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

        stage('Archive Report') {
            steps {
                archiveArtifacts artifacts: 'allure-report/**', fingerprint: true
            }
        }

        stage('Save Locally') {
            steps {
                echo 'Copying index.html to Desktop...'
                bat 'xcopy /Y allure-report\\index.html C:\\Users\\%USERNAME%\\Desktop\\allure-report\\index.html /F'
            }
        }
    }
}
