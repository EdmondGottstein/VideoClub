package com.edmond.VideoCLub.web.rest;

import com.edmond.VideoCLub.service.MovieRentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rentals")
public class MovieRentalController {

    @Autowired
    private MovieRentalService movieRentalService;
}
