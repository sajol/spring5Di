package com.springframework.config;

import com.springframework.propertybeans.ExampleDataSource;
import com.springframework.propertybeans.ExampleJms;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: sazal
 * Date: 12/31/17.
 */
@Configuration
public class PropertyConfig {

    @Value("${com.springframework.username}")
    String userName;
    @Value("${com.springframework.password}")
    String password;
    @Value("${com.springframework.dburl}")
    String dbUrl;
    @Value("${com.springframework.jmsusername}")
    String jmsUserName;
    @Value("${com.springframework.jmspassword}")
    String jmsPassword;
    @Value("${com.springframework.jmsurl}")
    String jmsUrl;

    @Bean
    public ExampleDataSource getExampleDataSource() {
        ExampleDataSource exampleDataSource = new ExampleDataSource();
        exampleDataSource.setUserName(userName);
        exampleDataSource.setPassword(password);
        exampleDataSource.setDbUrl(dbUrl);
        return exampleDataSource;
    }

    @Bean
    public ExampleJms getExampleJms() {
        ExampleJms exampleJms = new ExampleJms();
        exampleJms.setJmsUserName(jmsUserName);
        exampleJms.setJsmPassword(jmsPassword);
        exampleJms.setJmsUrl(jmsUrl);
        return exampleJms;
    }
}
