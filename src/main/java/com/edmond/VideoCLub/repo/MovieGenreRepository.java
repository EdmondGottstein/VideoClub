package com.edmond.VideoCLub.repo;

import com.edmond.VideoCLub.model.videoclub.MovieGenre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieGenreRepository extends JpaRepository<MovieGenre, Long> {
}
