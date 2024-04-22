package com.bbva.uuaa.exercise.facade.v0.dto;

public class DtoOut {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "DtoOut{" +
                "message='" + message + '\'' +
                '}';
    }
}
