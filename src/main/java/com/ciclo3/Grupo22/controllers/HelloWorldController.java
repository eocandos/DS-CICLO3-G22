package com.ciclo3.Grupo22.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")
public class HelloWorldController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hola Grupo 22 Ciclo 3";
    }


}
