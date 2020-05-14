package com.ajwlfforever.springtest.SpringTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class UserFunctionService {
    @Autowired
    FunctionService functionService;

    public String sayHello(String word)
    {
        return functionService.sayHello(word);
    }

    public void setFunctionService(FunctionService functionService)
    {
        this.functionService = functionService;
    }
}
