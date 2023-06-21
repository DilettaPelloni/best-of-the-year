package org.lessons.bestOfTheYear.controller;

import org.lessons.bestOfTheYear.model.Media;
import org.lessons.bestOfTheYear.model.Movie;
import org.lessons.bestOfTheYear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class Indexcontroller {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("name", "Diletta");
        return "index";
    }

}
