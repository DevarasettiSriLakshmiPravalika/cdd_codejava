pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout your Git repository
                git url: 'https://github.com/DevarasettiSriLakshmiPravalika/cdd_codejava.git', branch: 'main'
            }
        }

        stage('Compile') {
            steps {
                // Compile the Java program
                sh 'javac SumOfTwoNumbers.java'
            }
        }

        stage('Run') {
            steps {
                // Run the compiled Java program
                sh 'java SumOfTwoNumbers'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed. Check errors above.'
        }
    }
}
