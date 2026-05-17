def call(branchName) {

    withCredentials([usernamePassword(
        credentialsId: 'github-creds',
        usernameVariable: 'GIT_USERNAME',
        passwordVariable: 'GIT_PASSWORD'
    )]) {

        sh """
        git config user.name "Shrivastavavineet"
        git config user.email "vshrivastava902@gmail.com"

        git remote set-url origin https://${GIT_USERNAME}:${GIT_PASSWORD}@github.com/Shrivastavavineet/sharedilibrary.git

        git push origin ${branchName}
        """
    }
}
