def call() {
    echo "Starting GitLeaks Security Scan..."
    sh "gitleaks detect --source . -v"
}
