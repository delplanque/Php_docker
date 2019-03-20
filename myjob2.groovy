job('My Job 2') {
    scm {
        git('https://github.com/delplanque/Php_docker') {  node -> 
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