package com.qa.presistance.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

public class Trainee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long traineeId;
    @Column(length = 100)
    private String traineeName;

    public Trainee(){}

    public Long getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(Long traineeId) {
        this.traineeId = traineeId;
    }

    public String getTraineeName() {
        return traineeName;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }
}
