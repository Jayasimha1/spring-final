package com.bellinfo.details.user.controller;

import com.bellinfo.details.user.model.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@RequestMapping
@Controller
public class HomeController {

    @RequestMapping(value = "/", method= RequestMethod.GET)
    public String getIndex(Model model){
        UserDetails userDetails = new UserDetails();
        model.addAttribute("userDetails", userDetails);
        return "userDetails-login";
    }

    @RequestMapping(value = "/index", method= RequestMethod.GET)
    public String getIndexPage(Model model){
        UserDetails userDetails = new UserDetails();
        model.addAttribute("userDetails", userDetails);
        return "userDetails-login";
    }
}
