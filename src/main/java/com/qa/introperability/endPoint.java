package com.qa.introperability;

import com.qa.business.IService;
import com.qa.presistance.domain.Classroom;
import com.qa.presistance.domain.Trainee;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

@Path("/account")
public class endPoint {

    @Inject
    private IService service;

    @Path("/json/classroom")
    @POST
    @Produces({"application/json"})
    public String createClassroom(String jsonString){
        return service.createClassroom(jsonString);
    }

    @Path("/json/classroom")
    @GET
    @Produces({ "application/json" })
    public List<Classroom> getAllClassrooms() {
        return service.getAllClassrooms();
    }

    @Path("/json/classroom/{id}")
    @PUT
    @Produces({ "application/json" })
    public String updateClassroom(@PathParam("id") Long id, String classroom) {
        return service.updateClassroom(id, classroom);
    }

    @Path("/json/classroom/{id}")
    @DELETE
    @Produces({ "application/json" })
    public String deleteClassroom(@PathParam("id") long id) {
        return service.deleteAccount(id);
    }

    @Path("/json/trainee")
    @POST
    @Produces({"application/json"})
    public String createTrainee(String jsonString){
        return service.createTrainee(jsonString);
    }

    @Path("/json/trainee")
    @GET
    @Produces({ "application/json" })
    public List<Trainee> getAllTrainee() {
        return service.getAllTrainee();
    }

    @Path("/json/trainee/{id}")
    @PUT
    @Produces({ "application/json" })
    public String updateTrainee(@PathParam("id") Long id, String trainee) {
        return service.updateTrainee(id, trainee);
    }

    @Path("/json/trainee/{id}")
    @DELETE
    @Produces({ "application/json" })
    public String deleteTrainee(@PathParam("id") long id) {
        return service.deleteTrainee(id);
    }




}
