package com.yakimovich.ivan.RPnJava.controller;

import com.yakimovich.ivan.RPnJava.entity.ComfortOption;
import com.yakimovich.ivan.RPnJava.service.ComfortOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/comfort-option")
public class ComfortOptionController {
    private final ComfortOptionService comfortOptionService;

    @Autowired
    public ComfortOptionController(ComfortOptionService comfortOptionService) {
        this.comfortOptionService = comfortOptionService;
    }

    @GetMapping()
    public String getAll(Model model) {
        model.addAttribute("comfortOptions", comfortOptionService.getAll());
        return "comfort-option/list-comfort-option";
    }

    @GetMapping("/add")
    public String addEndpoint(@ModelAttribute ComfortOption comfortOption, Model model) {
        model.addAttribute("comfortOption", comfortOption);
        return "comfort-option/add-comfort-option";
    }

    @PostMapping("/add-item")
    public String add(@ModelAttribute ComfortOption comfortOption, BindingResult bindingResult, Model model) {
        comfortOptionService.create(comfortOption);
        return "redirect:/comfort-option";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") long id, Model model) {
        ComfortOption comfortOption = comfortOptionService.getById(id).orElseThrow(() -> new IllegalArgumentException("Invalid comfortOption Id:" + id));
        model.addAttribute("comfortOption", comfortOption);

        return "comfort-option/edit-comfort-option";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable("id") long id, ComfortOption comfortOption, BindingResult result, Model model) {
        comfortOptionService.create(comfortOption);
        return "redirect:/comfort-option";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        comfortOptionService.deleteById(id);
        return "redirect:/comfort-option";
    }
}
