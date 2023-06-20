package org.lessons.bestOfTheYear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Indexcontroller {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("name", "Diletta");
        return "index";
    }

}
