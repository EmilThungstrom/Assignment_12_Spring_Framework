package com.lexicon.emil.Assignment_12_Spring_Framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan({
                "com.lexicon.emil.Assignment_12_Spring_Framework.data_access",
                "com.lexicon.emil.Assignment_12_Spring_Framework.util",
                "com.lexicon.emil.Assignment_12_Spring_Framework.service"})
public class ComponentScanConfig {

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }
}
