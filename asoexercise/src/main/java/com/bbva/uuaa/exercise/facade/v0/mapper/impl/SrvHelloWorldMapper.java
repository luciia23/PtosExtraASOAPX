package com.bbva.uuaa.exercise.facade.v0.mapper.impl;

import com.bbva.uuaa.exercise.facade.v0.dto.DtoIn;
import com.bbva.uuaa.exercise.facade.v0.dto.DtoOut;
import com.bbva.uuaa.exercise.facade.v0.dto.Hello;
import com.bbva.uuaa.exercise.facade.v0.mapper.ISrvHelloWorldMapper;
import org.springframework.stereotype.Component;

//Para decirle que es un componente de Spring (para ahorrarnos el XML) (injeccion de dependencias)
@Component(value = "srvHelloWorldMapper")
public class SrvHelloWorldMapper implements ISrvHelloWorldMapper {

    @Override
    public Hello mapIn(DtoIn dtoIn) {
        Hello hello = new Hello();
        hello.setMessage(dtoIn.getName() + " " + dtoIn.getSurname());
        return hello;
    }

    @Override
    public DtoOut mapOut(Hello hello) {
        DtoOut dtoOut = new DtoOut();
        dtoOut.setMessage(hello.getMessage());
        return dtoOut;
    }
}
