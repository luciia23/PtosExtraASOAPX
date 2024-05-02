package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class UserIn {
    @NotEmpty
    @NotNull
    @Pattern(regexp = "^[A-Z]*$")
    private String name;
    @NotNull
    @Pattern(regexp = "^[A-Z]*$")
    private String surname;
    private Number phone;
    @Email
    private String email;
    @NotNull
    @NotEmpty
    private String dni;
}

