package com.github.bferi92.oneswallow.rest;

import com.github.bferi92.oneswallow.api.ObservationReport;
import com.github.bferi92.oneswallow.data.entity.Observation;
import com.github.bferi92.oneswallow.service.ObservationService;
import com.github.bferi92.oneswallow.service.exception.ObservationNotFoundException;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/observations")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ObservationResource {

    private ObservationService observationService;

    @Inject
    public ObservationResource(ObservationService observationService) {
        this.observationService = observationService;
    }

    @POST
    @Produces("application/json")
    public Response postObservation(@RequestBody ObservationReport observationReport) {
        observationService.postObservation(observationReport);
        return Response.ok().build();
    }

    @GET
    @Path("{observationId}")
    public Observation getObservation(@PathParam("observationId") long observationId) throws ObservationNotFoundException {
        return observationService.getObservation(observationId);
    }

    @GET
    public List<Observation> getObservations() {
        return observationService.getObservations();
    }

}
