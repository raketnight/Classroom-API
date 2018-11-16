package com.qa.presistance.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Classroom {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "CLASSROOM_ID")
    private Long classroomId;
    @Column(length = 100)
    private String trainer;
    @OneToMany(mappedBy = "classroom",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    //@JoinColumn(name = "CLASSROOM_ID")
    private List<Trainee> traineeList;

    public Classroom(){}

    public Long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public List<Trainee> getTraineeList() {
        return traineeList;
    }

    public void setTraineeList(List<Trainee> traineeList) {
        this.traineeList = traineeList;
    }
}