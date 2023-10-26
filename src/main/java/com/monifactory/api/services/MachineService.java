package com.monifactory.api.services;
import java.util.Optional;

import org.springframework.stereotype.Service;

import java.util.List;

import com.monifactory.api.infrastructure.api.ReleveApiDto;
import com.monifactory.api.infrastructure.entities.MachineRepository;
import com.monifactory.api.infrastructure.entities.Releve;
import com.monifactory.api.infrastructure.entities.ReleveRepository;
import com.monifactory.api.objets_perennes.StatutConsommation;
import com.monifactory.api.infrastructure.entities.ConsommationNormale;
import com.monifactory.api.infrastructure.entities.Machine;
@Service
public class MachineService {
    private MachineRepository machineRepository;
    private ReleveRepository releveRepository;
    
    public MachineService(MachineRepository machineRepository, ReleveRepository releveRepository) {
        this.machineRepository = machineRepository;
        this.releveRepository = releveRepository;
    }

    public StatutConsommation checkReleve(ReleveApiDto releveApiDto) {
        Optional<Machine> machineOptional = machineRepository.findById(releveApiDto.getIdMachine());
        // Check si la consommation courante est > la la consommation théorique
        Machine machine = machineOptional.get();
        Optional<Releve> releveOptional = releveRepository.findFirstReleveByMachineAndTypeIdOrderByDateReleveDesc(machine, 1);
        Releve dernierReleve = releveOptional.get();
        ConsommationNormale consommationNormale = machine.getModele().getConsommationNormale().get(0);
        Float consommationCourante = releveApiDto.getConsommation() - dernierReleve.getConso();
        boolean consommationExcessive = consommationCourante > consommationNormale.getConso();
        return consommationExcessive ? StatutConsommation.EXCESSIVE : StatutConsommation.OK;
    } 
}
