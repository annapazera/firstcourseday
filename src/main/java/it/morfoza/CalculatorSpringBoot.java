package it.morfoza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Anna Kacprzak on 2016-08-09.
 */@SpringBootApplication
public class CalculatorSpringBoot {
    public static void runOnSpringBoot(String[] args) {
        SpringApplication.run(CalculatorSpringBoot.class, args);
    }
}
