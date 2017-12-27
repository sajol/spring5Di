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
public class PropertyInjectionController {

    @Autowired
    @Qualifier(value = "greetingServiceImpl")
    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }
}
