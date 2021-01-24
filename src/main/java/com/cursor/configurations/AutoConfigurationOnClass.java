package com.cursor.configurations;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(name = "com.cursor.configurations.ConfigurationEnabler")
public class AutoConfigurationOnClass {
    public AutoConfigurationOnClass() {
        System.out.println("AutoConfigurationOnClass was created");
    }
}
