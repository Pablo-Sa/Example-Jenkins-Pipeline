pipeline {
    agent any
	
	tools {
      // Configure o Maven com Nome abaixo.
      maven "maven_3_5_0"
   }

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    sh 'mvn test'
                }
            }
        }


        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven_3_5_0') {
                    sh 'mvn deploy'
                }
            }
        }
		
	stage ('Email Notification') {
            mail bcc: '', body: 'Example Test Messagem E-mail Pipeline', cc: '', from: '', replyTo: '', subject: 'Mensagem de Teste', to: 'pablov.pereira@gmail.com'
        }
    }
}
