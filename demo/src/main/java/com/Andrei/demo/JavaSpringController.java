package com.Andrei.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaSpringController {

    @RequestMapping
    public String helloWorld() {
        return "Hello";
    }
}
