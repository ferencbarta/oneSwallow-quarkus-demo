package com.github.bferi92.oneswallow.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Observation {

    @Id
    private long id;

    private Date dateOfObservation;
    private String townOfObservation;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateOfObservation() {
        return dateOfObservation;
    }

    public void setDateOfObservation(Date dateOfObservation) {
        this.dateOfObservation = dateOfObservation;
    }

    public String getTownOfObservation() {
        return townOfObservation;
    }

    public void setTownOfObservation(String townOfObservation) {
        this.townOfObservation = townOfObservation;
    }
}
