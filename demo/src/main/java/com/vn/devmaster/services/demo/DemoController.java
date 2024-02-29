package com.vn.devmaster.services.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("")
    public String demo(){
        return "Đinh Hiếu";
    }
}
