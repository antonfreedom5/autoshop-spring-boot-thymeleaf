package com.yakimovich.ivan.RPnJava.controller;

import com.yakimovich.ivan.RPnJava.entity.Auto;
import com.yakimovich.ivan.RPnJava.service.AutoService;
import com.yakimovich.ivan.RPnJava.service.ComplectationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auto")
public class AutoController {
    private final AutoService autoService;
    private final ComplectationService complectationService;

    @Autowired
    public AutoController(AutoService autoService, ComplectationService complectationService) {
        this.autoService = autoService;
        this.complectationService = complectationService;
    }

    @GetMapping()
    public String getAll(Model model) {
        model.addAttribute("autos", autoService.getAll());
        return "auto/list-auto";
    }

    @GetMapping("/add")
    public String addEndpoint(@ModelAttribute Auto auto, Model model) {
        model.addAttribute("auto", auto);
        model.addAttribute("complectations", this.complectationService.getAll());
        return "auto/add-auto";
    }

    @PostMapping("/add-item")
    public String add(@ModelAttribute Auto auto, BindingResult bindingResult, Model model) {
        autoService.create(auto);
        return "redirect:/auto";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") long id, Model model) {
        Auto auto = autoService.getById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        model.addAttribute("auto", auto);
        model.addAttribute("complectations", this.complectationService.getAll());

        return "auto/edit-auto";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable("id") long id, Auto auto, BindingResult result, Model model) {
        autoService.create(auto);
        return "redirect:/auto";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        autoService.deleteById(id);
        return "redirect:/auto";
    }
}
