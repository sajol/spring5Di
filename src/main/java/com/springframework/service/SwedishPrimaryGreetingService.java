package com.springframework.service;

/**
 * Author: sazal
 * Date: 12/27/17
 */
public class SwedishPrimaryGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public SwedishPrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayHello() {
        return greetingRepository.getSwedishGreeting();
    }
}
