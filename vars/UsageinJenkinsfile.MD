```
@Library('your-shared-lib') _

pipeline {
    agent { label "agent_name" }
    stages {
        stage('Clone') {
            steps {
                script{
                    clone_repo("https://github.com/Ritesh001-Git/django-notes-app.git", "main")
                }
            }
        }
    }
}
```
