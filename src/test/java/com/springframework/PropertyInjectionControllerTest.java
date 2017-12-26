package com.springframework;

import com.springframework.controllers.PropertyInjectionController;
import com.springframework.service.GreetingSereviceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Author: sazal
 * Date: 12/26/17
 */
public class PropertyInjectionControllerTest {

    private PropertyInjectionController propertyInjectionController;

    @Before
    public void initialize(){
        propertyInjectionController = new PropertyInjectionController();
        propertyInjectionController.greetingService = new GreetingSereviceImpl();
    }

    @Test
    public void testSayHello(){
        Assert.assertEquals(GreetingSereviceImpl.HELLO, propertyInjectionController.greetingService.sayHello());
    }
}
