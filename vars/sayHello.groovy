def call(Map pipelineParams) {

    pipeline {
        agent any
        stages {
            stage('checkout git') {
                steps {
                   echo 'Hi Sujith'
                }
            }

            stage('build') {
                steps {
                    echo 'Hi Cloudjournee'
                }
            }

            stage ('test') {
                steps {
                    echo 'Hi jeeth'
                }
            }

            stage('deploy developmentServer'){
                steps {
                    echo 'Hi sujith'
                }
            }

            stage('deploy staging'){
                steps {
                    echo 'Hi Jithendra'
                }
            }

            stage('deploy production'){
                steps {
                    echo 'Hi Hitesh'
                }
            }
        }
       
    }
}
