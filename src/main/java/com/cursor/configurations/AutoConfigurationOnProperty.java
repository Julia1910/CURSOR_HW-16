package com.cursor.configurations;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "custom.configuration.enabled", havingValue="true")
public class AutoConfigurationOnProperty {
    public AutoConfigurationOnProperty() {
        System.out.println("AutoConfigurationOnProperty was created");
    }
}
