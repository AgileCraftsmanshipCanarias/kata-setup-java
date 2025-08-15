plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.11.4"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.assertj:assertj-core:3.27.4")
    testImplementation("org.mockito:mockito-core:5.19.0")
    testImplementation("com.approvaltests:approvaltests:25.0.23")
}

tasks.test {
    useJUnitPlatform()
}
