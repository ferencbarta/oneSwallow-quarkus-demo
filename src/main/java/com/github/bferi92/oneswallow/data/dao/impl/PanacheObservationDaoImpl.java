package com.github.bferi92.oneswallow.data.dao.impl;

import com.github.bferi92.oneswallow.data.dao.ObservationDao;
import com.github.bferi92.oneswallow.data.entity.Observation;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class PanacheObservationDaoImpl implements ObservationDao, PanacheRepository<Observation>  {

    @Override
    public void saveObservation(Observation observation) {
        persist(observation);
    }

    @Override
    public Optional<Observation> getObservation(long id) {
        return Optional.ofNullable(findById(id));
    }

    @Override
    public List<Observation> getAllObservations() {
        return findAll().list();
    }
}
