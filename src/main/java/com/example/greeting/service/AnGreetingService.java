package com.example.greeting.service;

import org.springframework.stereotype.Component;

@Component
public class AnGreetingService implements GreetingService {

    @Override
    public String getGreeting() {
        return "Xin chào từ Bạch An";
    }
}