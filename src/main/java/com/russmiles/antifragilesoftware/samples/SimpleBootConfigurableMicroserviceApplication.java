package com.russmiles.antifragilesoftware.samples;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class SimpleBootConfigurableMicroserviceApplication {

    @Value("${foo:World!}")
    private String value;

    @RequestMapping("/")
    public String home() {
        return this.toString() + " instance saying: Hello Microservice World with value of: " + value;
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleBootConfigurableMicroserviceApplication.class, args);
    }
}
