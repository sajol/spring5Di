package com.springframework.service;

/**
 * Author: sazal
 * Date: 12/26/17.
 */
public class GreetingSereviceImpl implements GreetingService {

    public static String HELLO = "HELLO!!!";

    @Override
    public String sayHello() {
        return HELLO;
    }
}
