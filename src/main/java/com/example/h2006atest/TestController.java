package com.example.h2006atest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("test")
    public String test(){
        return "test------1";
    }




}
