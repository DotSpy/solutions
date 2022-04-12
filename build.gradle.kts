plugins {
  kotlin("jvm") version "1.5.32"
}

repositories {
  mavenCentral()
}

dependencies {
  api("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
  testImplementation("org.junit.jupiter:junit-jupiter-api:5.3.2")
  testImplementation("org.junit.jupiter:junit-jupiter-params:5.3.2")
  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.3.2")
}

tasks.withType<Test> {
  testLogging.showStackTraces = true
  testLogging.exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
  useJUnitPlatform()
}
