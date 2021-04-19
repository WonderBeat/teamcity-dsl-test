package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.gradle
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object Build : BuildType({
    name = "Build"

    vcs {
        root(HttpsGithubComWonderBeatTeamcityDslTestGitRefsHeadsMain)
    }
    steps {
        gradle {
            name = "deploy-snapshot"
            tasks = "publish"
            buildFile = "/path/gradle.kt"
        }
    }
    triggers {
        vcs {
        }
    }
})