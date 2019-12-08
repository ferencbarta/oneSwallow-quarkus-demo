package com.github.bferi92.oneswallow.service.impl;

import com.github.bferi92.oneswallow.api.ObservationReport;
import com.github.bferi92.oneswallow.data.dao.ObservationDao;
import com.github.bferi92.oneswallow.data.entity.Observation;
import com.github.bferi92.oneswallow.service.ObservationService;
import com.github.bferi92.oneswallow.service.exception.ObservationNotFoundException;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.NotFoundException;
import java.util.List;

@ApplicationScoped
public class ObservationServiceImpl implements ObservationService {

    private ObservationDao observationDao;

    @Inject
    public ObservationServiceImpl(ObservationDao observationDao) {
        this.observationDao = observationDao;
    }

    @Override
    @Transactional
    public void postObservation(ObservationReport observationReport) {
        Observation observation = new ObservationBuilder(observationReport).build();
        observationDao.saveObservation(observation);
    }

    @Override
    public Observation getObservation(long observationId) throws ObservationNotFoundException {
        return observationDao.getObservation(observationId).orElseThrow(ObservationNotFoundException::new);
    }

    @Override
    public List<Observation> getObservations() {
        return observationDao.getAllObservations();
    }
}
