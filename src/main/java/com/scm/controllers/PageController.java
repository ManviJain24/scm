package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home Page handler");

        //sending data to view
        model.addAttribute("name","Substring Technologies");
        model.addAttribute("YoutubeChannel", "Learn Code With Durgesh");
        model.addAttribute("GithubRepo", "https://github.com/ManviJain24");
        return "home";
    }

    //about route
    
    @RequestMapping("/about")
    public String aboutPage() {
        System.out.println("About page loading");
        return "about";
    }

    //services
    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("services page loading");
        return "services";
    }
}
