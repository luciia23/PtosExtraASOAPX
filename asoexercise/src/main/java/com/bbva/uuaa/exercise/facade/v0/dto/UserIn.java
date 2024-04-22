package com.bbva.uuaa.exercise.facade.v0.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class UserIn {
    @NotNull
    private String name;
    @NotNull
    private String surname;
    @Pattern(regexp="[0-9]{10}")
    private String phone;
    @Email
    private String email;
    @NotNull
    @NotEmpty
    private String dni;
}
