pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout code from GitHub repository
                git branch: 'main', url: 'https://github.com/sohamk63/jenkins.git'
            }
        }
        
        stage('Deploy HTML files') {
            steps {
                // Copy HTML files to Xampp server
                bat 'copy *.html "C:\\xampp\\htdocs"'
            }
        }
    }
}

