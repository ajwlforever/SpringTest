package com.ajwlfforever.springtest.SpringTest.aop;

import org.springframework.stereotype.Service;


// 注解式拦截
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add(){}
}
