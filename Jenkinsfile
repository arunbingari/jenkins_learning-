
def gv

pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.0', '2.0', '3.0'], description: 'Version to deploy')
        booleanParam(name: 'executeTests', defaultValue: true, description: 'execute tests')
    }
    stages {
        stage("init") {
            steps {
                script {
                    gv = load "scripts.groovy"
                }
            }
        }
        stage("build") {
            steps {
                script {
                    gv.buildApp()
                } 
            }
        }
        stage("test") {
            when {
                expression { params.executeTests }
            }
            steps {
                script {
                    gv.testApp()
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
}
