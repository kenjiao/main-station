def profile = "prod"
def hub = "http://hub/wd/hub"
def browsers = ["chrome", "firefox"]

def stepsForParallel = [:]

for (int i = 0; i < browsers.size(); i++) {
    def browser = browsers.get(i)

    def cmd = "mvn clean verify -P${profile} -Dwebdriver=${browser} -Dremote.hub=${hub}"
    def stepName = "Test ${browser}"

    stepsForParallel[stepName] = mvn(cmd)
}

parallel stepsForParallel

def mvn(cmd) {
    return {
        node {
            echo cmd
            sh cmd
        }
    }
}