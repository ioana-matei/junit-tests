agentLabel = "FF"
pipeline{
    agent any
    // parameters {
    //     string(name: 'testsToRun', description: '' )
    //     string(name: 'testsToRunConverted',description: '' )
    // }

    stages {

        stage('Run Tests') {
            agent{
                label agentLabel
            }
            steps {
                convertTestsToRun format:'', framework: 'mvnSurefire'
                script {
                    bat 'call mvn clean test -fn -Dtest="%testsToRunConverted% -DoutputDirectory=" '
                    // bat 'call mvn clean test -fn'
                }
                catchError {
                    archiveArtifacts artifacts: 'target/surefire-reports/*.xml', onlyIfSuccessful: false
                    publishMicroFocusTestResults 'ONLY_ARCHIVE_FAILED_TESTS_REPORT'
                    // junit allowEmptyResults: true, testResults: 'target/surefire-reports-wrong/*.xml'
                    publishMicroFocusTestResults 'DONT_ARCHIVE_TEST_REPORT'
                }

            }

        }

    }
    post {
        always {
            // collectPullRequestsToAlmOctane configurationId: '7c8acf03-7e5e-45e5-bab6-5db89b102bf2', credentialsId: 'ce04e494-cc7c-4bb0-b42b-3aa56bfd7ea7', repositoryUrl: 'https://github.com/andreibangau99/junit-tests.git', scmTool: 'github_cloud', sourceBranchFilter: '', targetBranchFilter: '', workspaceId: '17004'
            // node(agentLabel) {
            //   cleanWs()
            // }
            cleanWs()
        }
    }

}
