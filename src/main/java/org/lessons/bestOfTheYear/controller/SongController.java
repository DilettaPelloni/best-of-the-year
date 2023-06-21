package org.lessons.bestOfTheYear.controller;

import org.lessons.bestOfTheYear.model.Media;
import org.lessons.bestOfTheYear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongController {

    @GetMapping
    public String songs(Model model) {
        model.addAttribute("songs", getBestSongs());
        return "songs";
    }

    //METODI PRIVATI ----------------------------------------------------------------------
    private List<Media> getBestSongs() {
        List<Media> songs = new ArrayList<>();
        songs.add(new Song(1, "Love of my life"));
        songs.add(new Song(2, "Seven seas of Rhye"));
        songs.add(new Song(3, "Hammer to fall"));
        songs.add(new Song(4, "Good old-fashioned lover boy"));
        return songs;
    }

}
