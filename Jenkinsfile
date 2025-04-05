pipeline {
    agent any  // This runs the pipeline on any available agent

    environment {
        MAVEN_HOME = tool 'Maven3'  // Matches the Maven tool name in Jenkins config
    }

    parameters {
        string(name: 'GIT_REPO', defaultValue: 'https://github.com/dharmatejasiddabathina/DevOps_Project.git', description: 'Git repository URL')
        string(name: 'BRANCH', defaultValue: 'main', description: 'Branch to build')
    }

    stages {
        stage('Clone Repository') {
            steps {
                echo "Cloning branch ${params.BRANCH} from ${params.GIT_REPO}"
                git branch: "${params.BRANCH}", url: "${params.GIT_REPO}"
            }
        }

        stage('Build with Maven') {
            steps {
                echo "Running Maven Build..."
                sh "${MAVEN_HOME}/bin/mvn clean install"
            }
        }
    }

    post {
        success {
            echo 'Build completed successfully.'
        }
        failure {
            echo 'Build failed.'
        }
    }
}
