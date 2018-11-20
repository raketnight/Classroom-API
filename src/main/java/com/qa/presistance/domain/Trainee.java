package com.qa.presistance.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Trainee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long traineeId;
    @Column(length = 100)
    private String traineeName;
    @Column
    private Long classroomId;

    public Long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
    }

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

/*public Classroom getClassroom() { //might need it laters
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    @ManyToOne
    @JoinColumn(name = "classroomId", nullable = false)
    private Classroom classroom;*/