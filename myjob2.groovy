job('My Job 1') {
    scm {
        git('https://github.com/akasam/jenkins-demo1') {  node -> 
            node / gitConfigName('J.delplanque')
            node / gitConfigEmail('delplanque.jordan@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('NodeJS9')
    }
    steps {
        shell("docker-compose up")
    }
}