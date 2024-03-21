def agentLabel = "FF"
pipeline{
    agent any
    parameters {
        string(name: 'testsToRun', description: '' )
    }

    stages {

        stage('Run Tests') {
            agent{
                label agentLabel
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
