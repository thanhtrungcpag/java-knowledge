package com;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
 
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDue(HttpServletRequest request, Model model){

        // read the request paramater from the html form
        String theName = request.getParameter("studentName");
        // convert the data to all caps
        theName = theName.toUpperCase();
        //  Create the string
        String result = "Yo " + theName;
        // add message to the model
        model.addAttribute("message", result);
        return "HelloWorld";
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

    @RequestMapping("/processFormInput")
    public String processFormInput(){
        return "Hello-Form";
    }
}
