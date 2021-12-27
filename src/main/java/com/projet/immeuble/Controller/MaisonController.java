package com.projet.immeuble.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Maison")
public class MaisonController {


    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
