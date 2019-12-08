package com.github.bferi92.oneswallow.service.impl;

import com.github.bferi92.oneswallow.api.ObservationReport;
import com.github.bferi92.oneswallow.data.entity.Observation;

import java.util.Date;

public class ObservationBuilder {

    private Date dateOfObservation;
    private String townOfObservation;

    public ObservationBuilder(ObservationReport observationReport) {
        this.dateOfObservation = observationReport.dateOfObservation;
        this.townOfObservation = observationReport.townOfObservation;
    }

    public Observation build() {
        Observation observation = new Observation();
        observation.setDateOfObservation(dateOfObservation);
        observation.setTownOfObservation(townOfObservation);
        return observation;
    }
}
