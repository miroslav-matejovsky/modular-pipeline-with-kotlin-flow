plugins {
    id("sk.bsmk.experiments.kotlin-application-conventions")
}

dependencies {
    implementation("org.apache.logging.log4j:log4j-slf4j-impl")
    implementation(project(":pipelines"))
}

application {
    mainClass.set("sk.bsmk.experiments.PipelineRunnerKt")
}