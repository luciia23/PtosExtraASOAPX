package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserOut {
    private String name;
    private String surname;
    private Number phone;
    private String email;
    private String dni;
}
