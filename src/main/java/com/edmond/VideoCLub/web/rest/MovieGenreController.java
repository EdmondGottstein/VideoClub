package com.edmond.VideoCLub.web.rest;

import com.edmond.VideoCLub.service.MovieGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/genres")
public class MovieGenreController {

    @Autowired
    private MovieGenreService movieGenreService;
}
