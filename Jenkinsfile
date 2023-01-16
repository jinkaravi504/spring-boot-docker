pipeline {
	agent any
	
	 environment
    {
  
       
        IMAGE = 'finops:latest'
		
    }
	
	stages {
		stage ('Compile Stage') {
			steps {
				withMaven(maven : 'maven') {
				 	sh 'mvn clean compile'
				}
			
			}
		}
		stage ('Test Stage') {
			steps {
				withMaven (maven : 'maven') {
				 	sh 'mvn test'
				}
			
			}
		}
		stage ('deploy Stage') {
			steps {
				withMaven (maven : 'maven') {
				 	sh 'mvn package'
				}
			
			}
		}
		stage('Docker build'){
		    steps {
			script{
			    // Build the docker image using a Dockerfile
			    docker.build("$IMAGE", "-f Dockerfile .")
			}
		    }
		}
	}
}

