# Spring-Boot Application

## PART 1: How To Create A Spring Boot Application

1. create new Maven project from your IDE(eclipse/intellij)
	* GroupId is your unique organizational name (can be used reverse domain name such as com.mycompany)*
	
2. add basic dependencies, properties, parent, build phrase to the pom.xml file.  
```
<parent>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-parent</artifactId>
	<version>1.5.9.RELEASE</version>
</parent>

<dependencies>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-web</artifactId>
	</dependency>
</dependencies>

<properties>
	<java.version>1.8</java.version>
</properties>

<build>
	<plugins>
		<plugin>
			<groupId>org.springframework.boot</groupId>
		    <artifactId>spring-boot-maven-plugin</artifactId>
		</plugin>
	</plugins>
</build>
```
		
- The <parent> tag tells Maven to inherit the properties of spring-boot-starter-parent, such as port number, configs, etc. All these are provided by Spring.
- The <dependencies> tag contains all the project dependencies. For now, we only have one dependency, spring-boot-starter-web. In a complete application, there could be more, e.g. MySQL, socket, JSON library, etc.
- The <build> contains build plugins, such as spring-maven-plugin.
	
3. update the Maven repository to download all the dependancies. (in eclipse Run as Maven build stc / in Intellij Generate Source and update..)
	
4. Create or Edit Main class
- add SpringApplication.run(<Mainclass.class>, args) function inside the Main function.
- add @SpringBootApplication annotaion to Main class

```
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplicationClass {
		
	public static void main(String[] args) {
		SpringApplication.run(MainApplicationClass.class, args);
	}
}
```
		
5. Run the application. Go to `localhost:8080` and it will give you an error page, because we don’t have a controller to handle our HTTP requests.
		