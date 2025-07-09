package com.example.greeting.client;

import com.example.greeting.service.GreetingService;
import org.springframework.stereotype.Component;

@Component // Đánh dấu đây là một Spring Component để có thể được inject
public class IT4Greeting {

    private final GreetingService greetingService;

    // Constructor Injection
    public IT4Greeting(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void showGreeting() {
        System.out.println(greetingService.getGreeting());
    }
}