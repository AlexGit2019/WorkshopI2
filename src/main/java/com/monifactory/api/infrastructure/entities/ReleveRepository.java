package com.monifactory.api.infrastructure.entities;

import java.util.Optional;

import org.springframework.data.repository.Repository;

public interface ReleveRepository extends Repository<Releve,Integer>{
    Optional<Releve> findFirstReleveByMachineAndTypeIdOrderByDateReleveDesc(Machine machine, int idType);
}
