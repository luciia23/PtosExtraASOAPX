package com.bbva.uuaa.exercise.business.v0.dao;

import com.bbva.uuaa.exercise.business.v0.dto.BUser;
import com.bbva.uuaa.exercise.business.v0.dto.BUserOut;

public interface ISrvExerciseDAO {
    BUserOut mapBUserOut(BUser bUser);
}
