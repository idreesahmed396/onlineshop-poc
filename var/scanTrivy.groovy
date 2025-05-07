def call(String imageFullName) {
    sh """
    docker run --rm \
        -v /var/run/docker.sock:/var/run/docker.sock \
        aquasec/trivy image --exit-code 1 --severity LOW,MEDIUM,HIGH --format table --output trivy-report.txt ${imageFullName}
    """
}