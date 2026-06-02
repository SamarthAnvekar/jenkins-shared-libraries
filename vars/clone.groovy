def call(String url, String branch){
  echo "this is coding stage"
  git url: "${url}", branch: "${branch}"
  echo "clone success"
}
