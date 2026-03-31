package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {
    int age;
    @GetMapping("/register")
    public String showForm() {
        return "register";
    }

    @PostMapping("/register")
    public String submitForm(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String password,
            Model model) {

        model.addAttribute("name", name);
        model.addAttribute("email", email);

        return "success";
    }
}
