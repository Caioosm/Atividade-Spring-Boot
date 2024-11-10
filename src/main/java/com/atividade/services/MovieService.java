package com.atividade.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.atividade.model.Movie;
import com.atividade.response.MovieResponse;

@Service
public class MovieService {

    @Value("${tmdb.api.key}")
    private String apiKey;

    private static final String API_URL = "https://api.themoviedb.org/3/search/movie?api_key=%s&query=%s";

    public Movie fetchMovieDetails(String movieName) {
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format(API_URL, apiKey, movieName);

        MovieResponse response = restTemplate.getForObject(url, MovieResponse.class);

        // Retorna o primeiro filme da lista (caso haja resultados)
        if (response != null && !response.getResults().isEmpty()) {
            return response.getResults().get(0); // Retorna o primeiro filme
        } else {
            return null; // Caso não encontre filmes
        }
    }
}
