def call(Map config = [:]){
  // Elvis operator ?:
  def imageName = config.imageName ?: error("Image name is required")
  def imageTag = config.imagrTag ?: 'latest'
  def dockerfile = config.dockerfile ?: 'dockerfile'
  def context = config.context ?: '.'

  echo "Building the Docker Image ${imageName}:${imageTag} using ${Dockerfile}"
  
  sh """
  docker build -t ${imageName}:${imageTag} -t ${imageName}:latest -f ${dockerfile} ${context}
  """
}
