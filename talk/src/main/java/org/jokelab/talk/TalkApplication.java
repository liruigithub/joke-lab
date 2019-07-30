package org.jokelab.talk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TalkApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(TalkApplication.class);
        application.run(args);
    }

}
