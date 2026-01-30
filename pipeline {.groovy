pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/DevarasettiSriLakshmiPravalika/cdd_codejava.git'
            }
        }

        stage('Build') {
            steps {
                sh 'javac SumOfTwoNumbers.java'
            }
        }

        stage('Execute') {
            steps {
                sh 'java SumOfTwoNumbers'
            }
        }
    }
}
