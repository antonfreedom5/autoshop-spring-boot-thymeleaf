package com.yakimovich.ivan.RPnJava.controller;

import com.yakimovich.ivan.RPnJava.entity.AutoOrder;
import com.yakimovich.ivan.RPnJava.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/order")
public class AutoOrderController {

    private final AutoService autoService;
    private final OrderService orderService;
    private final ComfortOptionService comfortOptionService;
    private final SecurityOptionService securityOptionService;

    @Autowired
    public AutoOrderController(AutoService autoService, OrderService orderService, ComfortOptionService comfortOptionService, SecurityOptionService securityOptionService) {
        this.autoService = autoService;
        this.orderService = orderService;
        this.comfortOptionService = comfortOptionService;
        this.securityOptionService = securityOptionService;
    }

    @GetMapping()
    public String getAll(Model model) {
        model.addAttribute("orders", orderService.getAll());
        return "order/list-order";
    }

    @GetMapping("/add")
    public String addEndpoint(@ModelAttribute AutoOrder order, Model model) {
        model.addAttribute("order", order);
        model.addAttribute("autos", this.autoService.getAll());
        model.addAttribute("comfortOptions", this.comfortOptionService.getAll());
        model.addAttribute("securityOptions", this.securityOptionService.getAll());
        return "order/add-order";
    }

    @PostMapping("/add-item")
    public String add(@ModelAttribute AutoOrder order, BindingResult bindingResult, Model model) {
        orderService.create(order);
        return "redirect:/order";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") long id, Model model) {
        AutoOrder order = orderService.getById(id).orElseThrow(() -> new IllegalArgumentException("Invalid order Id:" + id));
        model.addAttribute("order", order);
        model.addAttribute("autos", this.autoService.getAll());
        model.addAttribute("comfortOptions", this.comfortOptionService.getAll());
        model.addAttribute("securityOptions", this.securityOptionService.getAll());

        return "order/edit-order";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable("id") long id, AutoOrder order, BindingResult result, Model model) {
        orderService.create(order);
        return "redirect:/order";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        orderService.deleteById(id);
        return "redirect:/order";
    }
}
