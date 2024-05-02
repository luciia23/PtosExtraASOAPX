package com.bbva.uuaa.helloWorld.facade.v0.mapper;

import com.bbva.uuaa.helloWorld.business.v0.dto.BUser;
import com.bbva.uuaa.helloWorld.business.v0.dto.BUserOut;
import com.bbva.uuaa.helloWorld.facade.v0.dto.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ISrvUserMapper {
    BUser mapInCreateUser(UserIn userIn);
    UserOut mapOutUser(BUserOut bUserOut);
}
