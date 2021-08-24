package com.example.agileprojectbackend.mapper;

import com.example.agileprojectbackend.dto.MovieResponse;
import com.example.agileprojectbackend.model.Movie;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class MovieMapper {
    public MovieResponse toResponse(Movie movie) {
        MovieResponse movieResponse = new MovieResponse();
        BeanUtils.copyProperties(movie, movieResponse);

        return movieResponse;
    }


}
