def call(String repo_name , String branch_name = "main"){
  echo "Cloning the repo: ${repo_name} (branch: ${branch_name})"
  git url: repo_name , branch: branch_name
  echo "Clone Successful"
}
  
