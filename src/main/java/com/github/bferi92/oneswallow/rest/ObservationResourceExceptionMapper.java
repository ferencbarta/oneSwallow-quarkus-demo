package com.github.bferi92.oneswallow.rest;

import com.github.bferi92.oneswallow.service.exception.ObservationNotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ObservationResourceExceptionMapper implements ExceptionMapper<ObservationNotFoundException> {
    @Override
    public Response toResponse(ObservationNotFoundException e) {
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
