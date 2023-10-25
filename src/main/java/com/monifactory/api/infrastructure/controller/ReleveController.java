package com.monifactory.api.infrastructure.controller;

import java.util.Optional;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/*
import com.monifactory.api.infrastructure.api.ReleveApiDto;
import com.monifactory.api.infrastructure.entities.Machine;
import com.monifactory.api.infrastructure.entities.MachineRepository;
import com.monifactory.api.infrastructure.entities.Releve;

@RestController
public class ReleveController {
    private MachineRepository machineRepository;
    @PostMapping("/releve")
    public void stockerReleve(@RequestBody ReleveApiDto releveApiDto) {
        String query = "SELECT * from machine m join releve r on r.id_machine = m.id join modele mo on m.id_modele = mo.id join ";
        Optional<Machine> optionalMachine = machineRepository.findById(releveApiDto.getIdMachine());
        if (optionalMachine.isPresent()) {
            Machine machine = optionalMachine.get();
            List<Releve> listeReleves = machine.getReleves();
            if (listeReleves.size() != 0) {
                Float valeurAComparer = 
            }
        }
    }
}*/
