package com.ajwlfforever.springtest.SpringTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// @Sevice @Component  @Repository @Controller
public class Main1 {
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UserFunctionService userFunctionService = context.getBean(UserFunctionService.class);
        System.out.println(userFunctionService.sayHello("di"));
        context.close();
    }
}
