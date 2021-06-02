plugins {
    `java-library`
    `maven-publish`
    id("xyz.jpenilla.toothpick")
}

toothpick {
    forkName = "Zircon"
    groupId = "me._12emin34.zircon"
    forkUrl = "https://github.com/12emin34/Zircon"
    paperclipName = "zirconclip"
    val versionTag = System.getenv("BUILD_NUMBER")
            ?: "\"${commitHash() ?: error("Could not obtain git hash")}\""
    forkVersion = "git-$forkName-$versionTag"

    minecraftVersion = "1.16.5"
    nmsPackage = "1_16_R3"
    nmsRevision = "R0.1-SNAPSHOT"

    upstream = "Purpur"
    upstreamBranch = "origin/master"

    server {
        project = projects.zirconServer.dependencyProject
        patchesDir = rootProject.projectDir.resolve("patches/server")
    }
    api {
        project = projects.zirconApi.dependencyProject
        patchesDir = rootProject.projectDir.resolve("patches/api")
    }
}

subprojects {
    repositories {
        maven("https://nexus.velocitypowered.com/repository/velocity-artifacts-snapshots/")
    }

    java {
        sourceCompatibility = JavaVersion.toVersion(8)
        targetCompatibility = JavaVersion.toVersion(8)
    }
}