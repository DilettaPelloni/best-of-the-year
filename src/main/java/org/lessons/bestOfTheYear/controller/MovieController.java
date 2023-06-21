package org.lessons.bestOfTheYear.controller;

import org.lessons.bestOfTheYear.model.Media;
import org.lessons.bestOfTheYear.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {

    @GetMapping
    public String movies(Model model) {
        model.addAttribute("movies", getBestMovies());
        return "movies";
    }

    @GetMapping("/{id}")
    public String movieDetail(
            Model model,
            @PathVariable int id
    ) {
        Movie movie = null;
        for (Movie m : getBestMovies()) {
            if(m.getId() == id) {
                movie = m;
            }
        }

        if(movie != null) { //se l'id è valido mi porta alla pagina di dettaglio
            model.addAttribute("movie", movie);
            return "movieDetail";
        } else { //altrimenti mi reindirizza alla home
            return "redirect:/";
        }
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

}
