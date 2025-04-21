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

        stage('Publicar Reportes') {
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
    }

    post {
        success {
            echo '✅ ¡Build exitoso!'
        }
        failure {
            echo '❌ Falló el build.'
        }
    }
}
