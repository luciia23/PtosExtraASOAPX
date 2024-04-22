package com.bbva.uuaa.exercise.facade.v0.mapper;

import com.bbva.uuaa.exercise.facade.v0.dto.DtoIn;
import com.bbva.uuaa.exercise.facade.v0.dto.DtoOut;
import com.bbva.uuaa.exercise.facade.v0.dto.Hello;

public interface ISrvHelloWorldMapper {
    Hello mapIn(DtoIn dtoIn);
    DtoOut mapOut(Hello hello);
}
