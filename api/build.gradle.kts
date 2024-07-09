plugins {
    alias(libs.plugins.jvm)
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(21)
}