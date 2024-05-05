package com.bbva.uuaa.helloWorld.business.v0.dao.impl;

import com.bbva.jee.arq.spring.core.servicing.gce.BusinessServiceException;
import com.bbva.uuaa.helloWorld.business.v0.dao.ISrvHelloWorldDAO;
import com.bbva.uuaa.helloWorld.business.v0.dto.BUser;
import com.bbva.uuaa.helloWorld.business.v0.dto.BUserOut;
import org.springframework.stereotype.Component;

@Component(value="srvHelloWorldDAO")
public class SrvHelloWorldDAO implements ISrvHelloWorldDAO {

    @Override
    public BUserOut mapBUserOut(BUser bUser) {
        if (!validateNumber(bUser.getPhone()))
            throw new BusinessServiceException("bad phone number");
        BUserOut bUserOut = new BUserOut();
        bUserOut.setName(bUser.getName());
        bUserOut.setSurname(bUser.getSurname());
        bUserOut.setPhone(bUser.getPhone());
        bUserOut.setEmail(bUser.getEmail());
        bUserOut.setDni(bUser.getDni());
        return bUserOut;
    }

    private boolean validateNumber(Number number){
        String numStr = String.valueOf(number);
        String regex = "\\d{10}";
        return numStr.matches(regex);
    }
}
