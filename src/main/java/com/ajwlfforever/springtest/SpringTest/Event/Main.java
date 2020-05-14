package com.ajwlfforever.springtest.SpringTest.Event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(EventConfig.class);

        Publisher publisher = context.getBean(Publisher.class);
        publisher.publish("hello my baby ! ");

        context.close();
    }
}
