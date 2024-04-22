package com.bbva.uuaa.exercise.business.v0;

import com.bbva.uuaa.exercise.business.v0.dto.BUser;
import com.bbva.uuaa.exercise.business.v0.dto.BUserOut;

public interface IBSrvExercise {
    BUserOut mapBUserOut(BUser bUser);
}
