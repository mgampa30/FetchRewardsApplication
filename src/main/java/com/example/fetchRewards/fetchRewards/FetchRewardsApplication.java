/**
 * This package contains the main application class and configurations for the Fetch Rewards Receipt Processor.
 * The application is built using Spring Boot, providing a service for processing receipts and calculating points.
 */
package com.example.fetchRewards.fetchRewards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FetchRewardsApplication {

    // Entry point of the Spring Boot application
    public static void main(String[] args) {
        // Start the Spring application context and initialize the application
        SpringApplication.run(FetchRewardsApplication.class, args);
    }

}
