/*
 * Copyright 2019 (C) by Julian Horner.
 * All Rights Reserved.
 */

package de.rtuni.ms.ds;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author Julian
 *
 */
@SpringBootApplication
public class Application {
    //---------------------------------------------------------------------------------------------
    
    /**
     * Starts the application.
     * 
     * @param args The arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

    //---------------------------------------------------------------------------------------------

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }
    
    //---------------------------------------------------------------------------------------------
}
