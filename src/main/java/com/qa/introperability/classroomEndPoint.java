package com.qa.introperability;

import com.qa.business.IService;
import com.qa.presistance.domain.Classroom;
import com.qa.presistance.domain.Trainee;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

@Path("/classroom")
public class classroomEndPoint {

    @Inject
    private IService service;

    @Path("/json")
    @POST
    @Produces({"application/json"})
    public String createClassroom(String jsonString){
        return service.createClassroom(jsonString);
    }

    @Path("/json")
    @GET
    @Produces({ "application/json" })
    public List<Classroom> getAllClassrooms() {
        return service.getAllClassrooms();
    }

    @Path("/json/{id}")
    @PUT
    @Produces({ "application/json" })
    public String updateClassroom(@PathParam("id") Long id, String classroom) {
        return service.updateClassroom(id, classroom);
    }

    @Path("/json/{id}")
    @DELETE
    @Produces({ "application/json" })
    public String deleteClassroom(@PathParam("id") long id) {
        return service.deleteAccount(id);
    }



}
