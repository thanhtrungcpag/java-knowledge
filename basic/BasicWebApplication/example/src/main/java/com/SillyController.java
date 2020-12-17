package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("Helo")
public class SillyController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "Hello-Form";
    }

    @RequestMapping("/processFormVersionThree")
    public String letsShoutDueThree(@RequestParam("studentName") String theName, Model model){

        // convert the data to all caps
        theName = theName.toUpperCase();
        //  Create the string
        String result = "Yo " + theName;
        // add message to the model
        model.addAttribute("message", result);
        return "HelloWorld";
    }
}
