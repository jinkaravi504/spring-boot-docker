pipeline {
	agent any
	
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
				 	sh 'mvn deploy'
				}
			
			}
		}
	}
}
