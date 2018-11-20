package com.qa.business;

import com.qa.presistance.domain.Classroom;
import com.qa.presistance.domain.Trainee;

import java.util.List;

public interface IService {
    List<Classroom> getAllClassrooms();
    String createClassroom(String jsonString);
    String updateClassroom(long id, String classroomToUpdate);
    String deleteAccount(long id);
    List<Trainee> getAllTrainee();
    String createTrainee(String jsonString);
    String updateTrainee(long id, String classroomToUpdate);
    String deleteTrainee(long id);
}
