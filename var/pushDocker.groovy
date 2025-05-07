def call(String imageName, String dockerUser, String dockerPass) {
    sh "docker tag ${imageName} ${dockerUser}/${imageName}:latest"
    sh "echo ${dockerPass} | docker login -u ${dockerUser} --password-stdin"
    sh "docker push ${dockerUser}/${imageName}:latest"
}