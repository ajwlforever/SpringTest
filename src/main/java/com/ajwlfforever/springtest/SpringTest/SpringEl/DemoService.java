package com.ajwlfforever.springtest.SpringTest.SpringEl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Value("其他的属性")
    private String another;

    public String getValue()
    {
        return another;
    }
    public void setValue(String another)
    {
        this.another = another;
    }
}
