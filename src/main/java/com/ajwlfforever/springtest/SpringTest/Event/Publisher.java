package com.ajwlfforever.springtest.SpringTest.Event;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Publisher  {
    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg)
    {
        System.out.println(msg);
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }
}
