package com.example.agileprojectbackend.service;

import com.example.agileprojectbackend.exception.MovieNotFoundException;
import com.example.agileprojectbackend.model.Movie;
import com.example.agileprojectbackend.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    public Movie getMovieTodisplayDetailsById(Integer movieId){
        return movieRepository.findById(movieId)
                .orElseThrow(() -> new MovieNotFoundException("Movie ID not found!"));
    }

}
