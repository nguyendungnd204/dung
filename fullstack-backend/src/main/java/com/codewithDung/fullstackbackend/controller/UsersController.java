package com.codewithDung.fullstackbackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

    @GetMapping("/register")
    public String getRegisterPage()
    {
        return "register_page";
        //khi nguoi dung an vao login se chuyen den dia chi trang register
    }
    @GetMapping("/login")
    public String getLoginPage()
    {
        return "login_page";
    }

}
