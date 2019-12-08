package com.github.bferi92.oneswallow.data.dao;

import com.github.bferi92.oneswallow.data.entity.Observation;

import java.util.List;
import java.util.Optional;

public interface ObservationDao {
    void saveObservation(Observation observation);
    Optional<Observation> getObservation(long id);
    List<Observation> getAllObservations();
}
