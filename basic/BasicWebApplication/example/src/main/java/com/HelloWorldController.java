package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    
    @RequestMapping("/showForm")
    public String showForm(){
        return "Hello-Form";
    }
    @RequestMapping("/processForm")
    public String processForm(){
        return "HelloWorld";
    }
    
    @RequestMapping("/processFormInput")
    public String processFormInput(){
        return "Hello-Form";
    }
}
