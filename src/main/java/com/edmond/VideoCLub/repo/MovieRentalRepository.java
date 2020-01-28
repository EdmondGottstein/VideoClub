package com.edmond.VideoCLub.repo;

import com.edmond.VideoCLub.model.videoclub.MovieRental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRentalRepository extends JpaRepository<MovieRental, Long> {
}
