package com.github.bferi92.oneswallow.api;

import java.util.Date;

public class ObservationReport {
    public Date dateOfObservation;
    public String townOfObservation;

    public ObservationReport(Date dateOfObservation, String townOfObservation) {
        this.dateOfObservation = dateOfObservation;
        this.townOfObservation = townOfObservation;
    }

}
