pipeline {
    agent any

    tools {
        maven 'Mavengit '  // Đặt theo tên Maven bạn đã cài trong Jenkins (Manage Jenkins > Global Tool Configuration)
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/BachAn1205/greeting.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
