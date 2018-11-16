package com.qa.business;

import com.qa.presistance.domain.Classroom;

import java.util.List;

public interface IService {
    List<Classroom> getAllClassrooms();
    String createClassroom(String jsonString);
    String updateClassroom(long id, String classroomToUpdate);
    String deleteAccount(long id);
}
