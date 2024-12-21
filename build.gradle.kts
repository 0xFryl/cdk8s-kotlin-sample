plugins {
    application
    kotlin("jvm") version "2.0.21"
}

group = "com.mycompany.app"
version = "1.0-SNAPSHOT"

application {
    mainClass = "com.mycompany.app.MainKt"
}

kotlin {
    jvmToolchain(8)
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.cdk8s:cdk8s:2.69.27")
    implementation("org.cdk8s:cdk8s-plus-31:2.0.7")
    implementation("software.constructs:constructs:10.4.2")
    implementation("com.google.guava:guava:32.0.1-jre")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
