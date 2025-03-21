package ru.itgirl.controller;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Controller {
    @Bean
    public WeekdayTranslator weekdayTranslator() {
        return new WeekdayTranslator();
    }
}