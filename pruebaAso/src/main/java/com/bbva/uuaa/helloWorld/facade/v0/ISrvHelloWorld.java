package com.bbva.uuaa.helloWorld.facade.v0;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseCreated;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseNoContent;
import com.bbva.uuaa.helloWorld.facade.v0.dto.UserIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.UserOut;

public interface ISrvHelloWorld {

	ServiceResponseCreated<UserOut> createUser(UserIn userIn);

	ServiceResponseNoContent modifyUser(UserIn userIn);

}
