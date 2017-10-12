package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qwj on 2017/10/12.
 */
@RestController
@RequestMapping({"/message"})
public class MessageController {
    @Autowired
    private Message message;
    @RequestMapping("getMessage")
    public Object getMessage(){
        String name = message.getName();
        return  name;
    }

}
