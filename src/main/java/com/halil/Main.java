package com.halil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }
    /*@GetMapping("/")
    public GreetingRecord greet(){
        return new GreetingRecord("Hello");
    }
    record GreetingRecord(String greet){};*/

}
