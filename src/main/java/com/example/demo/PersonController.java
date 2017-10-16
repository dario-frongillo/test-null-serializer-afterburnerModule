package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @RequestMapping("/greeting")
    public ResponseEntity<?> getProva(){
        Person a = new Person();
        a.setA("x");
        a.setB(null);
        a.setC(null);
        return ResponseEntity.ok(a);
    }
}
