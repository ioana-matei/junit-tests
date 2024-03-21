def agentLabel1 = "FF"
def agentLabel2 = "AA"
pipeline{
    agent any
    parameters {
        string(name: 'testsToRun', description: '' )
        string(name: 'testsToRunConverted', description: '' )
    }

    stages {

        stage('Run Tests1') {
            agent{
                label agentLabel1
            }
            steps {
                convertTestsToRun format:'', framework: 'mvnSurefire'
                script {
                    bat 'call mvn clean test -fn -Dtest="%testsToRunConverted%" '
                }
                archiveArtifacts artifacts: 'target/surefire-reports/*.xml', onlyIfSuccessful: false
                junit allowEmptyResults: true, testResults: 'target/surefire-reports/*.xml'

            }

        }

    }
    // post {
    //     always {
    //         node(agentLabel) {
    //           cleanWs()
    //         }
    //         cleanWs()
    //     }
    // }

}
