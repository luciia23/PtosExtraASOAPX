package com.bbva.uuaa.exercise.facade.v0.impl;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseCreated;
import com.bbva.jee.arq.spring.core.servicing.annotations.SMC;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import com.bbva.uuaa.exercise.business.v0.IBSrvExercise;
import com.bbva.uuaa.exercise.business.v0.dto.BUser;
import com.bbva.uuaa.exercise.business.v0.dto.BUserOut;
import com.bbva.uuaa.exercise.facade.v0.ISrvExercise;
import com.bbva.uuaa.exercise.facade.v0.dto.*;
import com.bbva.uuaa.exercise.facade.v0.mapper.ISrvHelloWorldMapper;
import com.bbva.uuaa.exercise.facade.v0.mapper.ISrvUserMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

//Mala práctica porque incluye a todos
import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Service
@SN(registryID = "SN000000001", logicalID = "helloWorld")
@VN(vnn = "v0")
@Path("/v0")
public class SrvExercise implements ISrvExercise {
	//Forma más segura pero menos eficiente
	//private final ISrvHelloWorldMapper mapper;
	/*public SrvHelloWorld(ISrvHelloWorldMapper mapper){
		this.mapper = mapper;
	}*/

	//LLamada a la interfaz (al component)
	@Resource(name = "srvHelloWorldMapper")
	private ISrvHelloWorldMapper mapper;

	@Resource(name="bSrvExercise")
	private IBSrvExercise business;


	@Override
	@POST
	@Path("/create-user1")
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	@SMC(registryID = "SMC000000033", logicalID = "helloMapper")
	public ServiceResponseCreated<UserOut> createUser(UserIn userIn) {
		ISrvUserMapper mapper = Mappers.getMapper(ISrvUserMapper.class);
		BUser bUser = mapper.mapInCreateUser(userIn);
		BUserOut bUserOut = business.mapBUserOut(bUser);
		UserOut userOut = mapper.mapOutUser(bUserOut);
		return ServiceResponseCreated.data(userOut).build();
	}


}
