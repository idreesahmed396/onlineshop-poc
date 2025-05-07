def call(String imageFullName, int containerPort, int hostPort) {
    sh "docker rm -f app || true"
    sh "docker run -d -p ${hostPort}:${containerPort} --name app ${imageFullName}"
}