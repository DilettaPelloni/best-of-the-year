package org.lessons.bestOfTheYear.controller;

import org.lessons.bestOfTheYear.model.Media;
import org.lessons.bestOfTheYear.model.Movie;
import org.lessons.bestOfTheYear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/{id}")
    public String movieDetail(
            Model model,
            @PathVariable int id
    ) {
        Song song = null;
        for (Song s : getBestSongs()) {
            if(s.getId() == id) {
                song = s;
            }
        }

        if(song != null) { //se l'id è valido mi porta alla pagina di dettaglio
            model.addAttribute("song", song);
            return "songDetail";
        } else { //altrimenti mi reindirizza alla home
            return "redirect:/";
        }
    }

    //METODI PRIVATI ----------------------------------------------------------------------
    private List<Song> getBestSongs() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "Love of my life"));
        songs.add(new Song(2, "Seven seas of Rhye"));
        songs.add(new Song(3, "Hammer to fall"));
        songs.add(new Song(4, "Good old-fashioned lover boy"));
        return songs;
    }

}
