pipeline{
    agent any
    stages{
        stage('Checkout'){
            steps{
                echo 'Pulling code from Github...'
                // Jenkins handles the Git clone automatically when using Pipeline from SCM
            }
        }

        stage('Compile'){
            steps{
                echo 'Compiling the backend source code...'
                sh 'mvn clean compile'
            }
        }

        stage('Run Tests'){
            steps{
                echo 'Executing JUnit tests...'
                sh 'mvn test'
            }
        }
        
        stage('Package'){
            steps{
                echo 'Packaing application in JAR...'
                sh 'mvn package -DskipTests'
            }
        }
        
        stage('Deploy'){
            steps{
                echo 'Deploying the jar file...'
                sh 'java -jar target/jenkins-demo-0.0.1-SNAPSHOT.jar &'
            }
        }
        
    }
}
