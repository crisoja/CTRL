package com.example.agileprojectbackend.service;
import com.example.agileprojectbackend.exception.MovieNotFoundException;
import com.example.agileprojectbackend.model.Movie;
import com.example.agileprojectbackend.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(Integer movieId) {
        return movieRepository.findById(movieId)
                .orElseThrow(() -> new MovieNotFoundException("Movie ID not exist!"));
    }

    public List<Movie> getTrendingMovies() {
        return movieRepository.findAll(Sort.by(Sort.Direction.DESC, "criticsRating"))
                .stream()
                .filter(movie -> movie.getStatus().equals("showing"))
                .collect(Collectors.toList());
    }
}