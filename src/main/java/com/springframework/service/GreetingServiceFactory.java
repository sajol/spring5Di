package com.springframework.service;

/**
 * Author: sazal
 * Date: 12/30/17.
 */
public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService getGreetingService(String language) {
        switch (language) {
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            case "sw":
                return new SwedishPrimaryGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }
}
