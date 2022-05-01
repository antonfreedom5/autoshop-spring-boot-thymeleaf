package com.yakimovich.ivan.RPnJava.controller;

import com.yakimovich.ivan.RPnJava.entity.SecurityOption;
import com.yakimovich.ivan.RPnJava.service.SecurityOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/security-option")
public class SecurityOptionController {
    private final SecurityOptionService securityOptionService;

    @Autowired
    public SecurityOptionController(SecurityOptionService securityOptionService) {
        this.securityOptionService = securityOptionService;
    }

    @GetMapping()
    public String getAll(Model model) {
        model.addAttribute("securityOptions", securityOptionService.getAll());
        return "security-option/list-security-option";
    }

    @GetMapping("/add")
    public String addEndpoint(@ModelAttribute SecurityOption securityOption, Model model) {
        model.addAttribute("securityOption", securityOption);
        return "security-option/add-security-option";
    }

    @PostMapping("/add-item")
    public String add(@ModelAttribute SecurityOption securityOption, BindingResult bindingResult, Model model) {
        securityOptionService.create(securityOption);
        return "redirect:/security-option";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") long id, Model model) {
        SecurityOption securityOption = securityOptionService.getById(id).orElseThrow(() -> new IllegalArgumentException("Invalid securityOption Id:" + id));
        model.addAttribute("securityOption", securityOption);

        return "security-option/edit-security-option";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable("id") long id, SecurityOption securityOption, BindingResult result, Model model) {
        securityOptionService.create(securityOption);
        return "redirect:/security-option";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        securityOptionService.deleteById(id);
        return "redirect:/security-option";
    }
}
