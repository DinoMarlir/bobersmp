plugins {
    alias(libs.plugins.jvm)
    alias(libs.plugins.runpaper)
    alias(libs.plugins.serialization)
    alias(libs.plugins.shadow)

}

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    implementation(project(":api"))
    compileOnly(libs.bundles.paper)
    compileOnly(libs.bundles.serialization)
}

tasks {
    runServer {
        minecraftVersion("1.21")
    }

    withType<Jar> {
        archiveFileName.set("bobersmp.jar")
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}