package com.springframework;

import com.springframework.controllers.ConstructorInjectionController;
import com.springframework.service.GreetingSereviceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Author: sazal
 * Date: 12/26/17.
 */
public class ConstructorInjectionControllerTest {

    private ConstructorInjectionController constructorInjectionController;

    @Before
    public void initialize(){
        this.constructorInjectionController = new ConstructorInjectionController(new GreetingSereviceImpl());
    }

    @Test
    public void testSayHello(){
        Assert.assertEquals(GreetingSereviceImpl.HELLO, constructorInjectionController.sayHello());
    }
}
