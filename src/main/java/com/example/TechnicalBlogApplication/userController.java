package com.example.TechnicalBlogApplication;

import Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class userController {

    @RequestMapping("users/login")
    public String login(){
        return "users/login";
    }

    @RequestMapping("users/registration")
    public String registration(){
        return "users/registration";
    }

    @RequestMapping(value = "users/login",method = RequestMethod.POST)
    public String loginUser(User user){
       return "redirect:/posts";
    }
    
    
    @RequestMapping(value = "users/logout",method = RequestMethod.POST)
    public String logoutUser() {
    	return "redirect:/";
    }
    

}
