package com.example.greeting;

import com.example.greeting.client.IT4Greeting;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {

    private final IT4Greeting it4Greeting;

    // Inject IT4Greeting bằng constructor injection
    public MainApplication(IT4Greeting it4Greeting) {
        this.it4Greeting = it4Greeting;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Sau khi Spring Boot khởi động xong, gọi phương thức showGreeting
        it4Greeting.showGreeting();
    }
}