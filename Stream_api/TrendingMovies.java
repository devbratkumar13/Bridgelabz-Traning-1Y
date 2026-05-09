package com.gla.Stream_api;

import java.util.*;
import java.util.stream.*;

class Movie {
    String name;
    double rating;
    int year;

    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String toString() {
        return name + " Rating:" + rating + " Year:" + year;
    }
}

public class TrendingMovies {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("Movie A", 8.5, 2024),
                new Movie("Movie B", 9.1, 2025),
                new Movie("Movie C", 7.8, 2023),
                new Movie("Movie D", 8.9, 2025),
                new Movie("Movie E", 9.3, 2024),
                new Movie("Movie F", 8.7, 2025),
                new Movie("Movie G", 8.1, 2022)
        );

        movies.stream()
                .filter(m -> m.year >= 2024)
                .sorted((m1, m2) ->
                        Double.compare(m2.rating, m1.rating))
                .limit(5)
                .forEach(System.out::println);
    }
}
