plugins {
  alias(libs.plugins.kotlinJvm)
  application
}

kotlin {
  jvmToolchain(17)
}

repositories {
  mavenCentral()
}

dependencies {
  testImplementation(kotlin("test"))
  testImplementation(libs.org.junit.jupiter.junit.jupiter.api)
  testImplementation(libs.org.junit.jupiter.junit.jupiter.params)
  testRuntimeOnly(libs.org.junit.jupiter.junit.jupiter.engine)
  testRuntimeOnly(libs.org.junit.platform.junit.platform.launcher)
}

tasks.test {
  useJUnitPlatform()
}
