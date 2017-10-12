package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qwj on 2017/10/12.
 */
@RestController
@RequestMapping({"/home"})
public class PersonController {
    @Autowired
    PersonMapper personMapper;
    @RequestMapping(value = "/person")
    @ResponseBody
    public String Person(){
        Person person = personMapper.findPersonByName("qwj1");
        return person.getName()+"---"+person.getAge();
    }
}
