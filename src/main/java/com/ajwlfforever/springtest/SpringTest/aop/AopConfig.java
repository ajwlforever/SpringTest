package com.ajwlfforever.springtest.SpringTest.aop;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.ajwlfforever.springtest.SpringTest.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
