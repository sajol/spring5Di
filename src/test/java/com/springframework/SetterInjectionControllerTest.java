package com.springframework;

import com.springframework.controllers.SetterInjectionController;
import com.springframework.service.GreetingSereviceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Author: sazal
 * Date: 12/26/17.
 */
public class SetterInjectionControllerTest {

    private SetterInjectionController setterInjectionController;

    @Before
    public void initialize(){
        setterInjectionController = new SetterInjectionController();
        setterInjectionController.setGreetingService(new GreetingSereviceImpl());
    }

    @Test
    public void testSayHello(){
        Assert.assertEquals(GreetingSereviceImpl.HELLO, setterInjectionController.sayHello());
    }
}
