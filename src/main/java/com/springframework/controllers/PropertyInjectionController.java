package com.springframework.controllers;

import com.springframework.service.GreetingService;

/**
 * Author: sazal
 * Date: 12/26/17.
 */
public class PropertyInjectionController {

    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }
}
