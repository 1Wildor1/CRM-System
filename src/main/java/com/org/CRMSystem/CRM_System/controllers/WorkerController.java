package com.org.CRMSystem.CRM_System.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkerController {

    @GetMapping("/")
    public String Main() {
        return "/main";
    }

    @GetMapping("/admin")
    public String Admin() {
        return "/admin";
    }
}
