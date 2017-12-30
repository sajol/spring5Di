package com.springframework.config;

import com.springframework.service.GreetingRepository;
import com.springframework.service.GreetingService;
import com.springframework.service.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * Author: sazal
 * Date: 12/30/17.
 */
@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"default", "en"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.getGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("sw")
    GreetingService swedishPrimaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.getGreetingService("sw");
    }
}
