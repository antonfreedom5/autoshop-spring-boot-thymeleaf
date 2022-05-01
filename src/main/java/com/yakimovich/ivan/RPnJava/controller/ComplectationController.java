package com.yakimovich.ivan.RPnJava.controller;

import com.yakimovich.ivan.RPnJava.entity.Complectation;
import com.yakimovich.ivan.RPnJava.service.ComplectationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/complectation")
public class ComplectationController {
    private final ComplectationService complectationService;

    @Autowired
    public ComplectationController(ComplectationService complectationService) {
        this.complectationService = complectationService;
    }

    @GetMapping()
    public String getAll(Model model) {
        model.addAttribute("complectations", complectationService.getAll());
        return "complectation/list-complectation";
    }

    @GetMapping("/add")
    public String addEndpoint(@ModelAttribute Complectation complectation, Model model) {
        model.addAttribute("complectation", complectation);
        return "complectation/add-complectation";
    }

    @PostMapping("/add-item")
    public String add(@ModelAttribute Complectation complectation, BindingResult bindingResult, Model model) {
        complectationService.create(complectation);
        return "redirect:/complectation";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") long id, Model model) {
        Complectation complectation = complectationService.getById(id).orElseThrow(() -> new IllegalArgumentException("Invalid complectation Id:" + id));
        model.addAttribute("complectation", complectation);

        return "complectation/edit-complectation";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable("id") long id, Complectation complectation, BindingResult result, Model model) {
        complectationService.create(complectation);
        return "redirect:/complectation";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        complectationService.deleteById(id);
        return "redirect:/complectation";
    }
}
