package com.github.bferi92.oneswallow.service;

import com.github.bferi92.oneswallow.api.ObservationReport;
import com.github.bferi92.oneswallow.data.entity.Observation;
import com.github.bferi92.oneswallow.service.exception.ObservationNotFoundException;

import java.util.List;

public interface ObservationService {
    public void postObservation(ObservationReport observationReport);

    public Observation getObservation(long observationId) throws ObservationNotFoundException;

    public List<Observation> getObservations();
}
