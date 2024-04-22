package com.bbva.uuaa.exercise.business.v0.dao.impl;

import com.bbva.uuaa.exercise.business.v0.dao.ISrvExerciseDAO;
import com.bbva.uuaa.exercise.business.v0.dto.BUser;
import com.bbva.uuaa.exercise.business.v0.dto.BUserOut;
import org.springframework.stereotype.Component;

@Component(value="srvExerciseDAO")
public class SrvExerciseDAO implements ISrvExerciseDAO {
    @Override
    public BUserOut mapBUserOut(BUser bUser) {
        BUserOut bUserOut = new BUserOut();
        if (bUser == null)
            return null;
        bUserOut.setName(bUser.getName());
        bUserOut.setSurname(bUser.getSurname());
        bUserOut.setPhone(bUser.getPhone());
        bUserOut.setEmail(bUser.getEmail());
        bUserOut.setDni(bUser.getDni());
        return bUserOut;
    }
}
