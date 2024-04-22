package com.bbva.uuaa.exercise.facade.v0.mapper;

import com.bbva.uuaa.exercise.business.v0.dto.BUser;
import com.bbva.uuaa.exercise.business.v0.dto.BUserOut;
import com.bbva.uuaa.exercise.facade.v0.dto.DtoOut;
import com.bbva.uuaa.exercise.facade.v0.dto.UserIn;
import com.bbva.uuaa.exercise.facade.v0.dto.UserOut;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ISrvUserMapper {
    BUser mapInCreateUser(UserIn userIn);
    UserOut mapOutUser(BUserOut bUserOut);
}
