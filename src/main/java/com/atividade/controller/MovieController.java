package com.atividade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.atividade.model.Movie;
import com.atividade.services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MovieController {
    
    @Autowired
    private MovieService movieService;

    @GetMapping("/")
    public String showSearchForm(Model model) {
        // Inicializando o campo de pesquisa vazio
        model.addAttribute("movieName", "");
        return "search"; // Página de pesquisa
    }

    @GetMapping("/movies/search")
    public String searchMovie(@RequestParam("movieName") String movieName, Model model) {
        Movie movie = movieService.fetchMovieDetails(movieName);
        if (movie != null) {
            model.addAttribute("movie", movie);
        } else {
            model.addAttribute("error", "Filme não encontrado.");
        }
        return "movie"; // Nome do template Thymeleaf
    }
}
