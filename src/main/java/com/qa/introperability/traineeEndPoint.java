package com.qa.introperability;

import com.qa.business.IService;
import com.qa.presistance.domain.Trainee;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

@Path("/trainee")
public class traineeEndPoint {

    @Inject
    private IService service;

    @Path("/json")
    @POST
    @Produces({"application/json"})
    public String createTrainee(String jsonString){
        return service.createTrainee(jsonString);
    }

    @Path("/json")
    @GET
    @Produces({ "application/json" })
    public List<Trainee> getAllTrainee() {
        return service.getAllTrainee();
    }

    @Path("/json/{id}")
    @PUT
    @Produces({ "application/json" })
    public String updateTrainee(@PathParam("id") Long id, String trainee) {
        return service.updateTrainee(id, trainee);
    }

    @Path("/json/{id}")
    @DELETE
    @Produces({ "application/json" })
    public String deleteTrainee(@PathParam("id") long id) {
        return service.deleteTrainee(id);
    }
}
