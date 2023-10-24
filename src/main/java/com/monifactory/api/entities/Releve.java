package com.monifactory.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.ZonedDateTime;

@Entity
@Table(name = "Releve")
public class Releve {
    @Id
    private int id;
    @ManyToOne
    private Type type;
    private ZonedDateTime dateReleve;
    private Float conso;

    public int getId() {
        return id;
    }

    public Releve setId(int id) {
        this.id = id;
        return this;
    }

    public Type getType() {
        return type;
    }

    public Releve setType(Type type) {
        this.type = type;
        return this;
    }

    public ZonedDateTime getDateReleve() {
        return dateReleve;
    }

    public Releve setDateReleve(ZonedDateTime dateReleve) {
        this.dateReleve = dateReleve;
        return this;
    }

    public Float getConso() {
        return conso;
    }

    public Releve setConso(Float conso) {
        this.conso = conso;
        return this;
    }
}