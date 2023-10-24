package com.monifactory.api.infrastructure.entities;

import jakarta.persistence.*;

import java.time.ZonedDateTime;

@Entity
@Table(name = "Releve")
public class Releve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_type", referencedColumnName = "id")
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