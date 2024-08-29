package com.example.test.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@CrossOrigin(origins = "*")
public class Test {
    @GetMapping("/jorge")
    public String hola1() {
        return "Hola Jorge Cruceta!!";
    }

    @GetMapping("/cris")
    public String hola2() {
        return "Hola bb!!";
    }

    @GetMapping("/nico")
    public String hola3() {
        return "Hola nico-nico-ni!!";
    }
}
