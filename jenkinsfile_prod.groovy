gitBranchPattern = "*"
gitCredentialId = "had_devops_bddf_lud_cred_sgithub_pat_r"
githubUrl = "https://sgithub.fr.world.socgen"

gitPipelineCredentialUrl = "https://sgithub.fr.world.socgen/UOC-A5441-LUD-APPS/uoc_a5441_jenkins_pipelines"
jenkinsFile = "one_collection-jenkinsfile.groovy"

node{
    
    checkout([$class: 'GitSCM', branches: [[name: gitBranchPattern]], browser: [$class: 'GithubWeb', repoUrl: githubUrl], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'CleanBeforeCheckout'],
                                [$class: 'SubmoduleOption', disableSubmodules: false, parentCredentials: true,
                                 recursiveSubmodules: true, trackingSubmodules: false]], submoduleCfg: [], userRemoteConfigs: [[credentialsId: gitCredentialId, url: gitPipelineCredentialUrl]
                                 ]])
              
    def flow = load jenkinsFile

}
