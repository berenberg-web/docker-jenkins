import jenkins.model.*

Jenkins.instance.setNumExecutors(env['JENKINS_EXECUTORS'].toInteger())