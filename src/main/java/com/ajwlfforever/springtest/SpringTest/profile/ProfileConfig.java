package com.ajwlfforever.springtest.SpringTest.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public DemoBean devDemoVBean()
    {
        return new DemoBean("form development profile");

    }

    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean()
    {
        return new DemoBean("form production profile");

    }
}
