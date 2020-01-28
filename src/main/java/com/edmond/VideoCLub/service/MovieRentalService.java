package com.edmond.VideoCLub.service;

import com.edmond.VideoCLub.model.videoclub.MovieGenre;
import com.edmond.VideoCLub.model.videoclub.MovieRental;
import com.edmond.VideoCLub.repo.MovieRentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieRentalService {

    @Autowired
    private MovieRentalRepository movieRentalRepository;

    public MovieRental findOne(Long id){
        return movieRentalRepository.getOne(id);
    }

    public List<MovieRental> findAll() {
        return movieRentalRepository.findAll();
    }

    public MovieRental save(MovieRental movieRental){
        return movieRentalRepository.saveAndFlush(movieRental);
    }

    public void delete(Long id) {
        MovieRental movieRental = movieRentalRepository.getOne(id);
        movieRental.setDeleted(false);
        movieRentalRepository.saveAndFlush(movieRental);
    }
}
