package com.springframework.service;

import org.springframework.stereotype.Repository;

/**
 * Author: sazal
 * Date: 12/30/17.
 */
@Repository
public class GreetingRepositoryImpl implements GreetingRepository {

    public String getEnglishGreeting() {
        return "Hello!!Primary Greeting Service";
    }

    public String getSwedishGreeting() {
        return "Hello!! Primärhälsoservice";
    }
}
