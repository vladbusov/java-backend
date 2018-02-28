package com.stalingraph.controller;

import com.stalingraph.entity.User;
import com.stalingraph.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/users")
    public String getAllUsers(Model model){
        model.addAttribute("users",userService.findAll());
        return "usersList";
    }

    @GetMapping("/user/{id}")
    public String getById(@PathVariable("id") int id, Model model){
        model.addAttribute("user", userService.getById(id));
        return "userProfile";
    }

    @GetMapping("/adduser")
    public String createUserPage(){
        return "createUser";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int id ,Model model){
        model.addAttribute("user", userService.getById(id));
        return "updateUser";

    }

    @PostMapping("/updateUser")
    public String updateUser(@ModelAttribute("user") User user){
        userService.update(user);
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        userService.delete(id);
        return "redirect:/users";
    }


    @PostMapping("/adduser")
    public String addUser(@ModelAttribute("user") User user){
        userService.save(user);
        return "redirect:/users";
    }
}
