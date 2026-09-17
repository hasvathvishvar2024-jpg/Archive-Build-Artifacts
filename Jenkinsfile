pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/hasvathvishvar2024-jpg/Archive-Build-Artifacts.git'
            }
        }

        stage('Generate Report') {
            steps {
                bat 'javac app.java'
                bat 'java app'
            }
        }

        stage('Archive Report') {
            steps {
                archiveArtifacts artifacts: 'report.txt',
                    fingerprint: true
            }
        }
    }
}
