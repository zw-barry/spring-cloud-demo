package com.example.product.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

//    @Value("${mydemo.dd}")
//    public String dd;

    @GetMapping("/test")
    public String getDd() {
        return "22";
    }
}
