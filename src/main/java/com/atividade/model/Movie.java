package com.atividade.model;

// import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor 
@NoArgsConstructor
@Getter
@Setter
public class Movie {
    private String originalTitle;
    private String overview;
    private String original_language;
    private Double voteAverage;
    private String poster_path;

    // @JsonProperty("title")
    // public String getTitle() {
    //     return title;
    // }

    // public void setTitle(String title) {
    //     this.title = title;
    // }

    // @JsonProperty("overview")
    // public String getOverview() {
    //     return overview;
    // }

    // public void setOverview(String overview) {
    //     this.overview = overview;
    // }

    // @JsonProperty("release_date")
    // public String getReleaseDate() {
    //     return releaseDate;
    // }

    // public void setReleaseDate(String releaseDate) {
    //     this.releaseDate = releaseDate;
    // }

    // @JsonProperty("vote_average")
    // public Double getVoteAverage() {
    //     return voteAverage;
    // }

    // public void setVoteAverage(Double voteAverage) {
    //     this.voteAverage = voteAverage;
    // }

    // @JsonProperty("poster_path")
    // public String getPosterPath() {
    //     return posterPath;
    // }

    // public void setPosterPath(String posterPath) {
    //     this.posterPath = posterPath;
    // }
}
