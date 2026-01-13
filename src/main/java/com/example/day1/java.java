package com.example.day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class java {
    // hi i am lokesh
    @GetMapping("/")
    public String java(){
        return "this is first line";
    }
    @GetMapping("sum")
    public int sum(){
        return 1+2;
    }

}
