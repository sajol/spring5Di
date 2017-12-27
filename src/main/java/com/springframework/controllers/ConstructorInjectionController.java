package com.springframework.controllers;

import com.springframework.service.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Author: sazal
 * Date: 12/26/17.
 */
@Controller
public class ConstructorInjectionController {

    private GreetingService greetingService;

    public ConstructorInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayHello();
    }
}
