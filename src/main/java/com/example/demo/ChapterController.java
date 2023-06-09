package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChapterController {

    @RequestMapping(value = "/hello")
    @ResponseBody

    public String sayHello(){
        System.out.println("hello spring boot!!");
        return "你好 spring boot !";
    }
}
