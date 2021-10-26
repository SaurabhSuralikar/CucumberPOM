pipeline {
   agent any

   stages {
      stage('Helloo') {
         steps {
            echo 'Hello World'
         }
      }
       stage('Git Build') {
         steps {
            echo 'Pulling Code Fro Git'
            git 'https://github.com/SaurabhSuralikar/SaurabhSuralikar.git'
         }
      }
   }
}
