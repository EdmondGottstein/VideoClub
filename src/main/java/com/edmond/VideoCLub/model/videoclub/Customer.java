package com.edmond.VideoCLub.model.videoclub;

import com.edmond.VideoCLub.model.Person;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
public class Customer extends Person {

    @NotEmpty
    private String accountNumber;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private Set<MovieRental> movieRentals;


}
