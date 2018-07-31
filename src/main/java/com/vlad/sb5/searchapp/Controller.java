package com.vlad.sb5.searchapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/")
    public String index(){
        return "Hello World!\n";
    }
}
