package com.monifactory.api.infrastructure.entities;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface MachineRepository extends Repository<Machine,Integer> {
    @Query(value = "SELECT m FROM Machine m JOIN FETCH m.modele mod JOIN FETCH mod.consommationNormale cn WHERE m.id = :id and cn.type.id = 1")
    Optional<Machine> findById(Integer id);
}
