package com.springframework.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Author: sazal
 * Date: 12/27/17
 */
@Service
@Profile({"en", "default"})
@Primary
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "HELLO!!Primary Greeting Service";
    }
}
