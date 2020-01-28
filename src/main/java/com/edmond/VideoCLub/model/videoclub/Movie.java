package com.edmond.VideoCLub.model.videoclub;

import com.edmond.VideoCLub.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "movies")
@Getter
@Setter
@NoArgsConstructor
public class Movie extends BaseEntity {

    @NotEmpty
    private String name;

    @NotNull
    @Min(1)
    private Integer duration;

    @Min(1)
    @Max(10)
    private Double imdbScore;

    @NotNull
    @Min(1900)
    @Max(2020)
    private Integer releaseYear;

    private String movieArt;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private Set<MovieRental> movieRentals;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private MovieGenre genre;

}
