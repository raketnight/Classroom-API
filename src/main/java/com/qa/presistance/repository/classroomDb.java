package com.qa.presistance.repository;

import com.qa.presistance.domain.Classroom;
import com.qa.util.JSONUtil;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

@Transactional(SUPPORTS)
@Default
public class classroomDb implements IClassroom{

    @PersistenceContext(unitName = "primary")
    private EntityManager manager;

    @Inject
    private JSONUtil json;

    @Override
    public List<Classroom> getAllClassrooms() {
        TypedQuery<Classroom> query = manager.createQuery("SELECT c FROM Classroom c ORDER BY c.classroomId DESC", Classroom.class);
        return query.getResultList();
    }

    @Override
    @Transactional(REQUIRED)
    public String createClassroom(String jsonString) {
        Classroom aClassroom = json.getObjectForJSON(jsonString, Classroom.class);
        manager.persist(aClassroom);
        return "{\"message\": \"classroom has been sucessfully added\"}";
    }

    @Override
    @Transactional(REQUIRED)
    public String updateClassroom(long id, String classroomToUpdate) {
        Classroom updatedClassroom = json.getObjectForJSON(classroomToUpdate, Classroom.class);
        Classroom classroomFromDB = findClassroom(id);
        if (classroomToUpdate != null) {
            classroomFromDB = updatedClassroom;
            manager.merge(classroomFromDB);
        }
        return "{\"message\": \"Classroom sucessfully updated\"}";
    }

    @Override
    @Transactional(REQUIRED)
    public String deleteAccount(long id) {
        Classroom classroomInDB = findClassroom(id);
        if (classroomInDB != null) {
            manager.remove(classroomInDB);
        }
        return "{\"message\": \"account sucessfully deleted\"}";
    }

    private Classroom findClassroom(Long id) {
        return manager.find(Classroom.class, id);
    }
}
