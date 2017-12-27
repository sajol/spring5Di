package com.springframework.controllers;

import com.springframework.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Author: sazal
 * Date: 12/26/17.
 */
@Controller
public class SetterInjectionController {

    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }

    @Autowired
    public void setGreetingService(@Qualifier(value = "greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
