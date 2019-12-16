/*
 * Copyright 2019 (C) by Julian Horner.
 * All Rights Reserved.
 */

package de.rtuni.ms.ds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Dummy service.
 * 
 * @author Julian
 *
 */
@SpringBootApplication
@EnableEurekaClient     
public class Application {
    //---------------------------------------------------------------------------------------------
    
    /**
     * Starts the application.
     * 
     * @param args The arguments
     */
    public static void main(final String[] args) { SpringApplication.run(Application.class, args); }

    //---------------------------------------------------------------------------------------------
}
