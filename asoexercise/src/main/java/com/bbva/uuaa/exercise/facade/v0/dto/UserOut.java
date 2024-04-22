package com.bbva.uuaa.exercise.facade.v0.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class UserOut {
    private String name;
    private String surname;
    private String phone;
    private String email;
    private String dni;
}
