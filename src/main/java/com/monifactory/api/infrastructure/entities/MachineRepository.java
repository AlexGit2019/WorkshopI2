package com.monifactory.api.infrastructure.entities;

import java.util.Optional;

import org.springframework.data.repository.Repository;

public interface MachineRepository extends Repository<Machine,Integer> {
    Optional<Machine> findById(Integer id);
}
