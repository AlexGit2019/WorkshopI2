package com.monifactory.api.infrastructure.api;

import com.fasterxml.jackson.annotation.JsonCreator;

public class ReleveApiDto {
    private int idMachine;
    private Float consommation;
    
    @JsonCreator
    public ReleveApiDto(int idMachine, Float consommation) {
        this.idMachine = idMachine;
        this.consommation = consommation;
    }
    public int getIdMachine() {
        return idMachine;
    }

    public void setIdMachine(int idMachine) {
        this.idMachine = idMachine;
    }

    public Float getConsommation() {
        return consommation;
    }

    public void setConsommation(Float consommation) {
        this.consommation = consommation;
    }

    
}