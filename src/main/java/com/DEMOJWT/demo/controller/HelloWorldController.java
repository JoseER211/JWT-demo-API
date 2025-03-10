package com.DEMOJWT.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("welcome")
    public String helloWorld(@RequestParam(value="name", defaultValue="World") String name) {
        return "Bienvenido al sistema "+name+"!!";
    }
}
