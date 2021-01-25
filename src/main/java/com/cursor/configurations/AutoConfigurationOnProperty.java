package com.cursor.configurations;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoConfigurationOnProperty {

    @Bean
    @ConditionalOnProperty(name = "custom.configuration.enabled", havingValue="true")
    public String beanOnProperty() {
        System.out.println("AutoConfigurationOnProperty bean was created");
        return "bean";
    }
}
