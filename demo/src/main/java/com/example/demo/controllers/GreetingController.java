package com.example.demo.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
    @RequestMapping("/about")
    public ModelAndView getAbout() {
        return new ModelAndView("about.html");
    }
}
