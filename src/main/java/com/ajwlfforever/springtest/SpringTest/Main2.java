package com.ajwlfforever.springtest.SpringTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {

    public static  void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UserFunctionService userFunctionService = context.getBean(UserFunctionService.class);
        System.out.println(userFunctionService.sayHello("javaconfig"));
        context.close();
    }
}
