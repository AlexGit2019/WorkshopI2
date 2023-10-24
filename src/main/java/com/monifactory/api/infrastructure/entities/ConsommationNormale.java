package com.monifactory.api.infrastructure.entities;

import jakarta.persistence.*;

@Entity
@Table(name="ConsommationNormale")
public class ConsommationNormale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private Float conso;
    @ManyToOne
    private Type type;

    public int getId() {
        return id;
    }

    public ConsommationNormale setId(int id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ConsommationNormale setDescription(String description) {
        this.description = description;
        return this;
    }

    public Float getConso() {
        return conso;
    }

    public ConsommationNormale setConso(Float conso) {
        this.conso = conso;
        return this;
    }

    public Type getType() {
        return type;
    }

    public ConsommationNormale setType(Type type) {
        this.type = type;
        return this;
    }
}
