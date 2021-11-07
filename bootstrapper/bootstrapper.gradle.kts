/*
 * Copyright (c) 2021, Siraz <https://github.com/Sirazzz>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import org.apache.tools.ant.filters.ReplaceTokens

val vanillaDep: Configuration by configurations.creating

plugins {
    java
}

dependencies {
    annotationProcessor(group = "org.projectlombok", name = "lombok", version = ProjectVersions.lombokVersion)

    compileOnly(group = "org.projectlombok", name = "lombok", version = ProjectVersions.lombokVersion)
    compileOnly(group = "net.sf.jopt-simple", name = "jopt-simple", version = "5.0.4")
    compileOnly(group = "javax.inject", name = "javax.inject", version = "1")

    runtimeOnly(group = "org.slf4j", name = "slf4j-simple", version = "1.7.32")

    implementation(project(":http-api"))
    implementation(group = "org.slf4j", name = "slf4j-api", version = "1.7.32")
    implementation(group = "com.google.code.gson", name = "gson", version = "2.8.5")
}

tasks {
    processResources {
        finalizedBy("filterResources")
    }

    register<Copy>("filterResources") {
        val tokens = mapOf(
            "runelite.version" to ProjectVersions.rlVersion,
            "rs.version" to ProjectVersions.rsVersion.toString(),
            "sanlite.version" to ProjectVersions.sanliteVersion,
            "git.commit" to project.extra["gitCommit"]
        )

        logger.warn("floempie: $tokens")

        inputs.properties(tokens)

        from("src/main/resources/net/runelite/bootstrap") {
            include("bootstrapper.properties")
        }
        into("${buildDir}/resources/main/net/runelite/bootstrap")

        filter(ReplaceTokens::class, "tokens" to tokens)
        filteringCharset = "UTF-8"
    }

    register<JavaExec>("Bootstrapper.main()") {
        group = "bootstrapper"

        classpath = project.sourceSets.main.get().runtimeClasspath
        mainClass.set("net.runelite.bootstrap.Bootstrapper")
    }
}
