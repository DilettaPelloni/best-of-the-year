package org.lessons.bestOfTheYear.controller;

//IMPORT
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
        List<Movie> movies = getBestMovies();
        String moviesString = "";

        for (int i = 0; i < movies.size(); i++) {
            moviesString += movies.get(i).getTitle();
            if(i < movies.size() - 1) {
                moviesString += ", ";
            }
        }

        model.addAttribute("movies", moviesString);
        return "movies";
    }

    @GetMapping("/songs")
    public String songs(Model model) {
        List<Song> songs = getBestSongs();
        String songsString = "";

        for (int i = 0; i < songs.size(); i++) {
            songsString += songs.get(i).getTitle();
            if(i < songs.size() - 1) {
                songsString += ", ";
            }
        }

        model.addAttribute("songs", songsString);
        return "songs";
    }

    //METODI PRIVATI ----------------------------------------------------------------------
    private List<Movie> getBestMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1, "Via col vento"));
        movies.add(new Movie(2, "La leggenda del pianista sull'oceano"));
        movies.add(new Movie(3, "Titanic"));
        movies.add(new Movie(4, "RRR"));
        return movies;
    }
    private List<Song> getBestSongs() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "Love of my life"));
        songs.add(new Song(2, "Seven seas of Rhye"));
        songs.add(new Song(3, "Hammer to fall"));
        songs.add(new Song(4, "Good old-fashioned lover boy"));
        return songs;
    }

}
