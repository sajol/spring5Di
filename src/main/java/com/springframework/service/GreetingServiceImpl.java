package com.springframework.service;

import org.springframework.stereotype.Service;

/**
 * Author: sazal
 * Date: 12/26/17.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static String HELLO = "HELLO!!!";

    @Override
    public String sayHello() {
        return HELLO;
    }
}
