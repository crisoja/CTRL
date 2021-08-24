package com.example.agileprojectbackend.controller;

import com.example.agileprojectbackend.dto.MovieResponse;
import com.example.agileprojectbackend.mapper.MovieMapper;
import com.example.agileprojectbackend.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private MovieMapper movieMapper;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping("/{id}")
    public MovieResponse findCompanyById(@PathVariable Integer id){
        return movieMapper.toResponse(movieService.getMovieTodisplayDetailsById(id));
    }

}
