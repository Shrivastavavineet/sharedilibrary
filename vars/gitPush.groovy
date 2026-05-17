def call(String branchName) {
    echo "Pushing code to branch: ${branchName}"
    sh "git push origin ${branchName}"
}
