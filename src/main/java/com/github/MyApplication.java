package com.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
This is known as a «stereotype annotation».
It provides hints for people reading the code and for Spring
that the class plays a specific role.
In this case... a web `@Controller`, so Spring considers it when handling incoming web requests.
*/
@RestController
/*
This annotation is known as a «composed annotation», it combines
`@SpringBootConfiguration`,
`@EnableAutoConfiguration` and 
`@ComponentScan`.

Of those,
the annotation we’re most interested in here is `@EnableAutoConfiguration`.
[It] tells Spring Boot to “guess” how you want to configure Spring, based on the jar dependencies that you have added.
Since `spring-boot-starter-webmvc` added Tomcat and Spring MVC,
the auto-configuration assumes that you are developing a web application and sets up Spring accordingly.
*/
@SpringBootApplication
public class MyApplication {

    /*
    [This] annotation provides “routing” information.
    It tells Spring that any HTTP request with the `/` path should be mapped to the `home` method.

    The `@RestController` annotation tells Spring to render the resulting string directly back to the caller.
    */
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    /*
    This is a standard method that follows the Java convention for an application entry point.
    */
    public static void main(String[] args) {
        // [Bootstrap] our application,
        // starting Spring,
        // which, in turn, starts the auto-configured Tomcat web server.
        SpringApplication.run(
            MyApplication.class,  // This specifies the primary Spring component.
            args
        );
    }
}
