package ar.com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityFilterAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class, SecurityFilterAutoConfiguration.class })
@Configuration 
@ComponentScan 
public class UsersApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(UsersApplication.class, args);
       
    }

}