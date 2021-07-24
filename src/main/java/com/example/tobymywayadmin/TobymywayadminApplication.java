package com.example.tobymywayadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class TobymywayadminApplication {

    public static void main(String[] args) {
        SpringApplication.run(TobymywayadminApplication.class, args);
    }

}
