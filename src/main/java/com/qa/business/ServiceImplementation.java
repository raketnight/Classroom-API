package com.qa.business;

import com.qa.presistance.domain.Classroom;
import com.qa.presistance.domain.Trainee;
import com.qa.presistance.repository.IClassroom;

import javax.inject.Inject;
import java.util.List;

public class ServiceImplementation implements IService{

    @Inject
    IClassroom iClassroom;

    @Override
    public List<Classroom> getAllClassrooms() {
        return iClassroom.getAllClassrooms();
    }

    @Override
    public String createClassroom(String jsonString) {
        return iClassroom.createClassroom(jsonString);
    }

    @Override
    public String updateClassroom(long id, String classroomToUpdate) {
        return iClassroom.updateClassroom(id, classroomToUpdate);
    }

    @Override
    public String deleteAccount(long id) {
        return iClassroom.deleteAccount(id);
    }

    @Override
    public List<Trainee> getAllTrainee() {
        return iClassroom.getAllTrainee();
    }

    @Override
    public String createTrainee(String jsonString) {
        return iClassroom.createTrainee(jsonString);
    }

    @Override
    public String updateTrainee(long id, String classroomToUpdate) {
        return iClassroom.updateTrainee(id, classroomToUpdate);
    }

    @Override
    public String deleteTrainee(long id) {
        return iClassroom.deleteTrainee(id);
    }
}
