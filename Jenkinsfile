pipeline {
    agent any

    tools {
        maven 'Maven 3.8.1'
        jdk 'jdk17'
    }

    stages {
        stage('Clonar Repositorio') {
            steps {
                git 'https://github.com/Sergica2004/Calculadora-Java.git'
            }
        }

        stage('Compilar') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Ejecutar Pruebas') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Generar reportes') {
            steps {
                sh '''
                    mvn surefire-report:report-only
                    mvn site
                '''
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
            publishHTML(target: [
                reportDir: 'target/site',
                reportFiles: 'index.html',
                reportName: 'Reporte de Pruebas HTML'
            ])
        }
        success {
            echo '✅ ¡Build exitoso!'
        }
        failure {
            echo '❌ Falló el build.'
        }
    }
}
