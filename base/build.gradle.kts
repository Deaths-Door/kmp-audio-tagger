plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("com.android.library")
    id("maven-publish")
}

kotlin {
    android()

    jvm("desktop")

    js(IR) {
        browser()
        nodejs()
    }
    
    ios()

    cocoapods {
        summary = "Base module for https://github.com/Deaths-Door/MetaDataExtractor github library"
        version = "1.0"
        ios.deploymentTarget = "14.1"
        framework {
            baseName = "base"
        }
    }
    
    sourceSets {
        val commonMain by getting
        val commonTest by getting

        val androidMain by getting

        val desktopMain by getting
        val desktopTest by getting

        val jsMain by getting
        val jsTest by getting
    }
}

android {
    namespace = "com.deathsdoor.base"
    compileSdk = 32
    defaultConfig {
        minSdk = 21
        targetSdk = 32
    }
}
