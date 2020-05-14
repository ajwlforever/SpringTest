package com.ajwlfforever.springtest.SpringTest;

import org.apache.catalina.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class JavaConfig {
    @Bean
    public FunctionService functionService()
    {
        return new FunctionService();
    }

    @Bean
    public UserFunctionService userFunctionService()
    {
        UserFunctionService userFunctionService = new UserFunctionService();
        userFunctionService.setFunctionService(functionService());
        return userFunctionService;
    }

    @Bean
    public UserFunctionService userFunctionService(FunctionService functionService)
    {
        UserFunctionService userFunctionService = new UserFunctionService();
        userFunctionService.setFunctionService(functionService);
        return userFunctionService;
    }

}
