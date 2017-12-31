package com.springframework.config;

import com.springframework.datasource.ExampleDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Author: sazal
 * Date: 12/31/17.
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${com.springframework.username}")
    String userName;

    @Value("${com.springframework.password}")
    String password;

    @Value("${com.springframework.dburl}")
    String dbUrl;

    @Bean
    public ExampleDataSource getExampleDataSource(){
        ExampleDataSource exampleDataSource = new ExampleDataSource();
        exampleDataSource.setUserName(userName);
        exampleDataSource.setPassword(password);
        exampleDataSource.setDbUrl(dbUrl);
        return exampleDataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer getProperSourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}