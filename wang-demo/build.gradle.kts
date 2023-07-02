import org.jetbrains.kotlin.ir.backend.js.compile

plugins {
    id("java")
}

group = "org.springframework"
version = "5.3.28"

repositories {
    mavenCentral()
}

dependencies {

	implementation(project(":spring-context"))
	implementation(project(":spring-jdbc"))
	implementation(project(":spring-instrument"))
//	implementation(project(":spring-web"))

//    compile group: 'org.mybatis', name: 'mybatis-spring', version: '1.3.2'
//	compileOnly group: 'org.mybatis', name: 'mybatis-spring', version: '2.0.5'
//	compile group: 'mysql', name: 'mysql-connector-java', version: '5.1.44'
//	compile group: 'org.mybatis', name: 'mybatis', version: '3.4.5'
//
//	// https://mvnrepository.com/artifact/cglib/cglib
////    compile group: 'cglib', name: 'cglib', version: '3.2.12'
//
////    // https://mvnrepository.com/artifact/org.aspectj/aspectjrt
//	compile group: 'org.aspectj', name: 'aspectjrt', version: '1.9.5'
////     https://mvnrepository.com/artifact/org.aspectj/aspectjweaver
//	compile group: 'org.aspectj', name: 'aspectjweaver', version: '1.9.5'
//	compile group: 'javax.annotation', name: 'javax.annotation-api', version: '1.2'

	testImplementation(platform("org.junit:junit-bom:5.9.1"))
	testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

java {
	sourceCompatibility = JavaVersion.VERSION_11
	targetCompatibility = JavaVersion.VERSION_11
}
