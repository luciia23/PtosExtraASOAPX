package com.bbva.uuaa.exercise.business.v0.impl;

import com.bbva.uuaa.exercise.business.v0.IBSrvExercise;
import com.bbva.uuaa.exercise.business.v0.dao.ISrvExerciseDAO;
import com.bbva.uuaa.exercise.business.v0.dto.BUser;
import com.bbva.uuaa.exercise.business.v0.dto.BUserOut;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component(value = "bSrvExercise")
public class BSrvExercise implements IBSrvExercise {

    @Resource(name = "srvExerciseDAO")
    private ISrvExerciseDAO dao;

    @Override
    public BUserOut mapBUserOut(BUser bUser) {
        return dao.mapBUserOut(bUser);
    }
}
