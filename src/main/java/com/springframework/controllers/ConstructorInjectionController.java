package com.springframework.controllers;

import com.springframework.service.GreetingService;

/**
 * Author: sazal
 * Date: 12/26/17.
 */
public class ConstructorInjectionController {

    private GreetingService greetingService;

    public ConstructorInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayHello();
    }
}
