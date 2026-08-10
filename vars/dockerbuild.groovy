def call(String imageName){
  echo "Building docker image : ${imageName}"
  sh "docker build -t ${imageName} ."
}
