
node {
    checkout scm 
    /* .. snip .. */
}
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -X -DskipTests clean package' 
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true 
            }
        }
    }
}
