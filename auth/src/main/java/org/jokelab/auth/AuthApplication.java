package org.jokelab.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(AuthApplication.class);
        app.run(args);
    }

}
