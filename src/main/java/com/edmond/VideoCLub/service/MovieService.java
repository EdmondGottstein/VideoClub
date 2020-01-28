package com.edmond.VideoCLub.service;

import com.edmond.VideoCLub.model.videoclub.Movie;
import com.edmond.VideoCLub.model.videoclub.MovieRental;
import com.edmond.VideoCLub.repo.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Movie findOne(Long id){
        return movieRepository.getOne(id);
    }

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    public Movie save(Movie movie){
        return movieRepository.saveAndFlush(movie);
    }

    public void delete(Long id) {
        Movie movie = movieRepository.getOne(id);
        movie.setDeleted(false);
        movieRepository.saveAndFlush(movie);
    }


}
