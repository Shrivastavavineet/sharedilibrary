def call(String stage) {
    if (stage == 'compile') {
        sh 'mvn clean compile'
    } else if (stage == 'test') {
        sh 'mvn test'
    } else if (stage == 'build') {
        sh 'mvn package -DskipTests'
    }
}
