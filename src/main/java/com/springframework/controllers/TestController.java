package com.springframework.controllers;

import com.springframework.service.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Author: sazal
 * Date: 12/26/17
 */

@Controller
public class TestController {

    GreetingService greetingService;

    public TestController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello() {
        System.out.println(greetingService.sayHello());
    }
}
