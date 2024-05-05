package com.bbva.uuaa.helloWorld.facade.v0.impl;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseCreated;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseNoContent;
import com.bbva.jee.arq.spring.core.servicing.annotations.SMC;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import com.bbva.uuaa.helloWorld.business.v0.IBSrvHelloWorld;
import com.bbva.uuaa.helloWorld.business.v0.dto.BUser;
import com.bbva.uuaa.helloWorld.business.v0.dto.BUserOut;
import com.bbva.uuaa.helloWorld.facade.v0.ISrvHelloWorld;
import com.bbva.uuaa.helloWorld.facade.v0.dto.UserIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.UserOut;
import com.bbva.uuaa.helloWorld.facade.v0.mapper.ISrvUserMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Service
@SN(registryID = "SN000000001", logicalID = "helloWorld")
@VN(vnn = "v0")
@Path("/v0")
public class SrvHelloWorld implements ISrvHelloWorld {

	@Resource(name = "bSrvHelloWorld")
	private IBSrvHelloWorld business;

	@Override
	@POST
	@Path("/create-user")
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	@SMC(registryID = "SMC000000033", logicalID = "helloMapper")
	public ServiceResponseCreated<UserOut> createUser(@Valid UserIn userIn) {
		ISrvUserMapper mapper = Mappers.getMapper(ISrvUserMapper.class);
		BUser bUser = mapper.mapInCreateUser(userIn);
		BUserOut bUserOut = business.mapBUserOut(bUser);
		UserOut userOut = mapper.mapOutUser(bUserOut);
		return ServiceResponseCreated.data(userOut).build();
	}

	@Override
	@PUT
	@Path("/modify-user")
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	@SMC(registryID = "SMC000000033", logicalID = "helloMapper")
	public ServiceResponseNoContent modifyUser(@Valid UserIn userIn) {
		ISrvUserMapper mapper = Mappers.getMapper(ISrvUserMapper.class);
		BUser bUser = mapper.mapInCreateUser(userIn);
		business.mapBUserOut(bUser);
		return ServiceResponseNoContent.ServiceResponseNoContentBuilder.build();
	}


}
