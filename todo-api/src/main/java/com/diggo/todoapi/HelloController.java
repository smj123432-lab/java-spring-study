package com.diggo.todoapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "안녕하세요, 형님!";
    }
    @GetMapping("/bye")
    public String sayBye(){
        return "안녕히가세요";
    }
}