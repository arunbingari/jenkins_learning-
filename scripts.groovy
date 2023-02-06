def buildApp(){
    echo "Building ..."
}

def testApp(){
    echo "Testing ..."
}

def deployApp(){
    echo "Deploying ..."
    echo "Deploying the veriosn ${params.APP_VERSION}"
}

return this
