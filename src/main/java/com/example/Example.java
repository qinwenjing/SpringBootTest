package com.example;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qwj on 2017/10/11.
 */
@RestController
@EnableAutoConfiguration
public class Example {
    @RequestMapping("/")
    String home(){
        return "Hello World";
    }
    @RequestMapping("/hello/{myName}")
    String index(@PathVariable String myName){
        return "Hello "+myName+"!!!";
    }
}
