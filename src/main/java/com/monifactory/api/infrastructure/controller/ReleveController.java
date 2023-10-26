package com.monifactory.api.infrastructure.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.monifactory.api.infrastructure.api.ReleveApiDto;
import com.monifactory.api.objets_perennes.StatutConsommation;
import com.monifactory.api.services.MachineService;

@RestController
public class ReleveController {
    private MachineService machineService;
    
    public ReleveController(MachineService machineService) {
        this.machineService = machineService;
    }

    @PostMapping("/releve")
    public StatutConsommation stockerReleve(@RequestBody ReleveApiDto releveApiDto) {
        return machineService.checkReleve(releveApiDto);
    }
}
