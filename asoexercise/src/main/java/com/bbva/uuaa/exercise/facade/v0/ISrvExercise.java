package com.bbva.uuaa.exercise.facade.v0;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseCreated;
import com.bbva.uuaa.exercise.facade.v0.dto.*;

public interface ISrvExercise {

	ServiceResponseCreated<UserOut> createUser(UserIn userIn);

}
