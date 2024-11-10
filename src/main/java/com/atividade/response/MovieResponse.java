package com.atividade.response;

import java.util.List;

import com.atividade.model.Movie;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieResponse {
    
    @JsonProperty("results")
    private List<Movie> results;

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }
}
