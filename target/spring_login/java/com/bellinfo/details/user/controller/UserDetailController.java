package com.bellinfo.details.user.controller;

import com.bellinfo.details.user.Service.UserDetailsService;
import com.bellinfo.details.user.model.UserDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class UserDetailController {

    Logger log = LoggerFactory.getLogger(UserDetailController.class);

    @Autowired
    UserDetailsService userDetailsService;

    @RequestMapping(value = "/", method= RequestMethod.GET)
    public String getIndex(Model model){
        UserDetails userDetails = new UserDetails();
        log.info("Team adding in / request", userDetails);
        model.addAttribute("userDetails", userDetails);
        return "user-login";
    }

    @RequestMapping(value = "/index", method= RequestMethod.GET)
    public String getIndexPage(Model model){
        UserDetails userDetails = new UserDetails();
        log.info("Team adding in / request", userDetails);
        model.addAttribute("userDetails", userDetails);
        return "user-login";
    }


    @RequestMapping(value="/add", method=RequestMethod.GET)
    public String addUserDetails(Model model){
        UserDetails userDetails = new UserDetails();
        log.info("Team adding in /add get request", userDetails);
        model.addAttribute("userDetails", userDetails);
        return "user-login";
    }

    @RequestMapping(value="/add", method=RequestMethod.POST)
    public String addTeam(@ModelAttribute UserDetails userDetails, Model model) {
        log.info("Team adding in /add post request", userDetails);
        userDetailsService.addUserDetails(userDetails);
        return "user-login";
    }

}
