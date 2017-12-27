package com.springframework;

import com.springframework.controllers.ConstructorInjectionController;
import com.springframework.controllers.PropertyInjectionController;
import com.springframework.controllers.SetterInjectionController;
import com.springframework.controllers.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiApplication.class, args);
        TestController testController = (TestController) context.getBean("testController");
        testController.sayHello();
        ConstructorInjectionController constructorInjectionController =
                context.getBean(ConstructorInjectionController.class);
        System.out.println(constructorInjectionController.sayHello());
        PropertyInjectionController propertyInjectionController =
                context.getBean(PropertyInjectionController.class);
        System.out.println(propertyInjectionController.sayHello());
        SetterInjectionController setterInjectionController =
                context.getBean(SetterInjectionController.class);
        System.out.println(setterInjectionController.sayHello());
    }
}
