package org.example.autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GimnasioApp {

    public static void main(String[] args) {
        SpringApplication.run(GimnasioApp.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context) {
        return args -> {
            Gimnasio gimnasio = context.getBean(Gimnasio.class);
            gimnasio.displayGymDetails();
        };
    }
}

