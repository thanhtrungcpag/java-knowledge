package com;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @RequestMapping("/processFormInput")
    public String processFormInput(){
        return "Hello-Form";
    }
}
