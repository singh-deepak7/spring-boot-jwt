package com.user.management.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserManagementController {

    @RequestMapping({ "/hello" })
    public String firstPage() {
        return "Hello World";
    }
}
