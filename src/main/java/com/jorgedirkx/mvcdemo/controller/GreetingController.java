package com.jorgedirkx.mvcdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting") // if you go to this page, following method will be executed:
    public String greeting(@RequestParam(name ="name",required = false,defaultValue = "world") String nameParameter, Model model){
        model.addAttribute("name",nameParameter);
        return "greeting";
    }




}
