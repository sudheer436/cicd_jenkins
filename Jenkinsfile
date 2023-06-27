pipeline {
    agent any
    tools{
        maven 'MAVEN_HOME'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/sudheer436/cicd_jenkins']])
                sh 'mvn clean install'
            }
        }
         stage('Build docker image'){
            steps{
                script{
                    sh 'docker build -t cicd-jenkins .'
                }
            }
        }
         stage('Push image to Hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                        sh 'docker login -u sudheer3388 -p ${dockerhubpwd}'
                    }
                    sh 'docker  tag cicd-jenkins sudheer3388/cicd-jenkins'
                    sh 'docker push sudheer3388/cicd-jenkins'
                }
            }
        }


    }
}