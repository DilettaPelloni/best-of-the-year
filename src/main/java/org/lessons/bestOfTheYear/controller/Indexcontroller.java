package org.lessons.bestOfTheYear.controller;

//IMPORT
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

    //GET ----------------------------------------------------------------------
    @GetMapping
    public String index(Model model) {
        model.addAttribute("name", "Diletta");
        return "index";
    }

    @GetMapping("/movies")
    public String movies(Model model) {
        model.addAttribute("movies", mediaListToString(getBestMovies()));
        return "movies";
    }

    @GetMapping("/songs")
    public String songs(Model model) {
        model.addAttribute("songs", mediaListToString(getBestSongs()));
        return "songs";
    }

    //METODI PRIVATI ----------------------------------------------------------------------
    private List<Media> getBestMovies() {
        List<Media> movies = new ArrayList<>();
        movies.add(new Movie(1, "Via col vento"));
        movies.add(new Movie(2, "La leggenda del pianista sull'oceano"));
        movies.add(new Movie(3, "Titanic"));
        movies.add(new Movie(4, "RRR"));
        return movies;
    }
    private List<Media> getBestSongs() {
        List<Media> songs = new ArrayList<>();
        songs.add(new Song(1, "Love of my life"));
        songs.add(new Song(2, "Seven seas of Rhye"));
        songs.add(new Song(3, "Hammer to fall"));
        songs.add(new Song(4, "Good old-fashioned lover boy"));
        return songs;
    }

    private String mediaListToString(List<Media> list) { //per convertire una lista di media in stringa
        String listString = "";
        for (int i = 0; i < list.size(); i++) {
            listString += list.get(i).getTitle();
            if(i < list.size() - 1) {
                listString += ", ";
            }
        }
        return listString;
    }

}
