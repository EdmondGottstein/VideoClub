package com.edmond.VideoCLub.service;

import com.edmond.VideoCLub.model.videoclub.Employee;
import com.edmond.VideoCLub.model.videoclub.MovieGenre;
import com.edmond.VideoCLub.repo.MovieGenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieGenreService {

    @Autowired
    private MovieGenreRepository movieGenreRepository;

    public MovieGenre findOne(Long id){
        return movieGenreRepository.getOne(id);
    }

    public List<MovieGenre> findAll() {
        return movieGenreRepository.findAll();
    }

    public MovieGenre save(MovieGenre movieGenre){
        return movieGenreRepository.saveAndFlush(movieGenre);
    }

    public void delete(Long id) {
        MovieGenre movieGenre = movieGenreRepository.getOne(id);
        movieGenre.setDeleted(false);
        movieGenreRepository.saveAndFlush(movieGenre);
    }
}
