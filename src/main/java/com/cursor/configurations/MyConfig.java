package com.cursor.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cursor")
public class MyConfig {
    public MyConfig() {
        System.out.println("MyConfig was created");
    }
}
