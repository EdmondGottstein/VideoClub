package com.edmond.VideoCLub.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;

@MappedSuperclass
@Getter
@Setter
public class Person extends BaseEntity {


    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    @NotEmpty
    private String emailAddress;
    @NotEmpty
    private String phoneNumber;


}
