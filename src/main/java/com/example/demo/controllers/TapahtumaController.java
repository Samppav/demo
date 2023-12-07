package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Tapahtuma;
import com.example.demo.repositories.TapahtumaRepository;

import org.springframework.ui.Model;

@Controller
public class TapahtumaController {

    @Autowired
    private TapahtumaRepository tapahtumaRepository;

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("list", tapahtumaRepository.findAll());
        return "henkilot"; // tässä oletetaan erillinen tiedosto henkilot.html
    }

    @PostMapping("/")
    public String create(@RequestParam String nimi) {
        tapahtumaRepository.save(new Tapahtuma(nimi));
        return "redirect:/";
    }
}
