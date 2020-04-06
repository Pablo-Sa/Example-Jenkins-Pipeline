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
          mail bcc: '', body: 'Messagem Teste Pipilene', cc: '', from: '', replyTo: '', subject: 'Jenkins Job', to: 'pablo.sa@linx.com.br'
        }
    }
}
