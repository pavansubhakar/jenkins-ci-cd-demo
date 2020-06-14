package com.jenkins.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {


    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld(4);
        int theNumber = helloWorld.getNumber();

        SpringApplication.run(DemoApplication.class, args);
        System.out.println(theNumber);
    }

}
