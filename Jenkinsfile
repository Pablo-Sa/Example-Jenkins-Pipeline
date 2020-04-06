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
	}
  
	post {
		always {
			mail bcc: '', body: '''Bom dia, 
			 Build Executado.
			  Att.,''', cc: '', from: '', replyTo: '', subject: 'E-mail de Informação Builds Projeto Iniciado', to: 'pablov.pereira12@gmail.com'
			   }
		success {  
             mail bcc: '', body: '''Bom dia, 
			  Build Executado Com Sucesso.
			  Att.,''', cc: '', from: '', replyTo: '', subject: 'E-mail de Informação Builds, Sucesso.', to: 'pablov.pereira12@gmail.com'
		 }  
        failure {  
             mail bcc: '', body: '''Bom dia, 
			 Build Falhou.
			  Att.,''', cc: '', from: '', replyTo: '', subject: 'E-mail de Informação Builds, Falha', to: 'pablov.pereira12@gmail.com'
         }  
        unstable {  
              mail bcc: '', body: '''Bom dia, 
			 Build instável.
			  Att.,''', cc: '', from: '', replyTo: '', subject: 'E-mail de Informação Builds, instável', to: 'pablov.pereira12@gmail.com'
         }			   
        }
    } 
