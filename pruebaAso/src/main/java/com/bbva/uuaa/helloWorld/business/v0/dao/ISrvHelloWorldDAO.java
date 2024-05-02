package com.bbva.uuaa.helloWorld.business.v0.dao;

import com.bbva.uuaa.helloWorld.business.v0.dto.BUser;
import com.bbva.uuaa.helloWorld.business.v0.dto.BUserOut;

public interface ISrvHelloWorldDAO {
    BUserOut mapBUserOut(BUser bUser);
}
