package com.gfa.springplussql.controller;

import com.gfa.springplussql.model.Fox;
import com.gfa.springplussql.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FoxController {
    private final FoxService foxService;

    @Autowired
    public FoxController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/")
    public String showIndex(Model model){
        model.addAttribute("foxes", foxService.listAllFoxes());
        return "index";
    }

    @PostMapping("/")
    public String createFox(@ModelAttribute Fox fox){
        foxService.createFox(fox);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteFox(@PathVariable(name = "id") Long id) {
        foxService.deleteFoxById(id);
        return "redirect:/";
    }

    @GetMapping("/increase/{id}")
    public String updateFox(@PathVariable(name = "id") Long id) {
        foxService.updateFoxById(id);
        return "redirect:/";
    }

    @GetMapping("/filter")
    public String findFoxbyName(Model model, @RequestParam(name = "search") String search) {
        model.addAttribute("foxes", foxService.findByString(search));
        return "index";
    }

    @GetMapping("/red-jpql")
    public String findRedFoxesJPQL(Model model) {
        model.addAttribute("foxes", foxService.findRedFoxesJPQL());
        return "index";
    }

    @GetMapping("/red-native")
    public String findRedFoxesNative(Model model) {
        model.addAttribute("foxes", foxService.findRedFoxesNative());
        return "index";
    }
}
