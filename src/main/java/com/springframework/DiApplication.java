package com.springframework;

import com.springframework.controllers.TestController;
import com.springframework.propertybeans.ExampleDataSource;
import com.springframework.propertybeans.ExampleJms;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiApplication.class, args);
        TestController testController = (TestController) context.getBean("testController");
        testController.sayHello();
        ExampleDataSource dataSource = context.getBean(ExampleDataSource.class);
        System.out.println("Data source user name : " + dataSource.getUserName());
        System.out.println("Data source password : " + dataSource.getPassword());
        System.out.println("Data source db url : " + dataSource.getDbUrl());

        ExampleJms jms = context.getBean(ExampleJms.class);
        System.out.println("Jms source user name : " + jms.getJmsUserName());
        System.out.println("Jms source password : " + jms.getJsmPassword());
        System.out.println("Jms source url : " + jms.getJmsUrl());
    }
}
