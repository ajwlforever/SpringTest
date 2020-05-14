package com.ajwlfforever.springtest.SpringTest.Event;

import org.springframework.context.ApplicationListener;

public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("我接受到了event的消息: "+msg);
    }
}
