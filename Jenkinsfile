pipeline {
    agent any
    parameters {
        choice(name: 'APP_VERSION', choices:['1.1.0','1.1.1','1.1.3'], description: 'Version of the application')
        booleanParam(name: 'executeTests', defaultValue: true, description: 'Test the application')
    }
        stages {
            stage ('init'){
                gv = load 'scripts.groovy'
            }
        stage('build') {
            scripts{
                gv.buildApp()
            }
            }
        stage('test') {
           
                when {
                    expression { 
                        params.executeTests 
                    }
                }
                scripts{
                    gv.testApp()
                }
        }
        stage('deploy') {
            scripts{
                gv.deployApp()
            }
        }
    }