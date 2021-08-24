package com.example.agileprojectbackend.service;

import com.example.agileprojectbackend.exception.MovieNotFoundException;
import com.example.agileprojectbackend.model.Movie;
import com.example.agileprojectbackend.repository.CinemaRepository;
import com.example.agileprojectbackend.model.Cinema;
import com.example.agileprojectbackend.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CinemaService {
    @Autowired
    private CinemaRepository cinemaRepository;

    @Autowired
    private MovieRepository movieRepository;
    HashMap<String,String> movieNameAndScreenTime;
    public List<Cinema> getAllCinema(){
        return cinemaRepository.findAll();
    }
    public Cinema getAllPosterByCinemaName(String cinemaName) {
        Cinema cinema = cinemaRepository.findByName(cinemaName);
        return cinema;
    }

    public List<Time> getScreenTimeById(String cinemaName) {
        Cinema cinema = cinemaRepository.findByName(cinemaName);
         return cinema.getScreening().stream().map(screening -> screening.getStartTime()).collect(Collectors.toList());
    }

}
