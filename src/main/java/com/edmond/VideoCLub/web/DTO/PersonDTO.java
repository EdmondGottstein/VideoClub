package com.edmond.VideoCLub.web.DTO;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class PersonDTO extends BaseDTO {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
}
