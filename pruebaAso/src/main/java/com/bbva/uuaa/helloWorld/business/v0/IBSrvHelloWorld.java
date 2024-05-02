package com.bbva.uuaa.helloWorld.business.v0;

import com.bbva.uuaa.helloWorld.business.v0.dto.BUser;
import com.bbva.uuaa.helloWorld.business.v0.dto.BUserOut;

public interface IBSrvHelloWorld {
    BUserOut mapBUserOut(BUser bUser);
}
