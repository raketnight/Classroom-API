package com.qa.presistance.repository;

import com.qa.presistance.domain.Classroom;
import com.qa.presistance.domain.Trainee;
import com.qa.util.JSONUtil;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;

@Alternative
public class classroomHash implements IClassroom{

    private static HashMap<String, Classroom> classroomHash;

    @Inject
    JSONUtil json;

    //@Override
    public HashMap<String, Classroom> getAllClassrooms() {
        return classroomHash;
    }

    @Override
    public String createClassroom(String jsonString) {
        Classroom classroom = json.getObjectForJSON(jsonString, Classroom.class);
        classroomHash.put(Long.toString(classroom.getClassroomId()), classroom);
        return "{\"message\": \"classroom sucessfully created\"}";
    }

    @Override
    public String updateClassroom(long id, String classroomToUpdate) {
        Classroom updatedClassroom = json.getObjectForJSON(classroomToUpdate, Classroom.class);
        Classroom classroomFromDB = findClassroom(id);
        if (classroomToUpdate != null) {
            classroomFromDB = updatedClassroom;
            classroomHash.put(Long.toString(id), classroomFromDB);
        }
        return "{\"message\": \"Classroom sucessfully updated\"}";

    }

    @Override
    public String deleteAccount(long id) {
        classroomHash.remove(Long.toString(id));
        return "{\"message\": \"Classroom sucessfully deleted\"}";
    }

    //@Override
    public List<Trainee> getAllTrainee() {
        return null;
    }

    @Override
    public String createTrainee(String jsonString) {
        return null;
    }

    @Override
    public String updateTrainee(long id, String classroomToUpdate) {
        return null;
    }

    @Override
    public String deleteTrainee(long id) {
        return null;
    }

    public Classroom findClassroom(long id){
        return classroomHash.get(id);
    }
}
