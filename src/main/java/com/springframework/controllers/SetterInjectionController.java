package com.springframework.controllers;

import com.springframework.service.GreetingService;

/**
 * Author: sazal
 * Date: 12/26/17.
 */
public class SetterInjectionController {

    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
