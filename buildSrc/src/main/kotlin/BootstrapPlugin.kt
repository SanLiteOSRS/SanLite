import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.*

class BootstrapPlugin : Plugin<Project> {
    override fun apply(project: Project): Unit = with(project) {
        val bootstrapDependencies by configurations.creating {
            isCanBeConsumed = false
            isCanBeResolved = true
            isTransitive = false
        }

        val hostingRepositories = mapOf(
            "github" to "https://raw.githubusercontent.com/sanliteosrs/hosting-repo/master",
            "gitlab" to "https://gitlab.com/sanlite/hosting-repo/-/raw/master"
        )

        dependencies {
            bootstrapDependencies(project(":runelite-api"))
            bootstrapDependencies(project(":runescape-api"))
            bootstrapDependencies(project(":runelite-client"))
            bootstrapDependencies(project(":runelite-jshell"))
        }

        tasks.register<BootstrapTask>("bootstrapStaging", "staging", hostingRepositories)
        tasks.register<BootstrapTask>("bootstrapLive", "live", hostingRepositories)

        tasks.withType<BootstrapTask> {
            this.group = "sanlite"
            this.clientJar.fileProvider(provider { tasks["jar"].outputs.files.singleFile })

            dependsOn(bootstrapDependencies)
            dependsOn("publish")
            dependsOn(project(":runelite-api").tasks["publish"])
            dependsOn(project(":runescape-api").tasks["publish"])
            dependsOn(project(":runelite-jshell").tasks["publish"])

            doLast {
                copy {
                    from(bootstrapDependencies)
                    into("${buildDir}/bootstrap/${type}/")
                }
                copy {
                    from(
                            "${buildDir}/repo/.",
                            "${parent?.projectDir}/runelite-api/build/repo/.",
                            "${parent?.projectDir}/runescape-api/build/repo/.",
                            "${parent?.projectDir}/runelite-jshell/build/repo/."
                    )
                    into("${buildDir}/bootstrap/repo/${type}")
                }
            }
        }
    }
}
