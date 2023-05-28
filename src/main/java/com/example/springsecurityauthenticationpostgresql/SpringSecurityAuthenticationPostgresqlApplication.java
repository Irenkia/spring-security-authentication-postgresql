package com.example.springsecurityauthenticationpostgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.springsecurityauthenticationpostgresql"})
public class SpringSecurityAuthenticationPostgresqlApplication {//extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityAuthenticationPostgresqlApplication.class, args);
    }

}
