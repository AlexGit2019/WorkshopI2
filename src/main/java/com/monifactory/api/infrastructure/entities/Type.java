package com.monifactory.api.infrastructure.entities;

import jakarta.persistence.*;

@Entity
@Table(name="type_conso")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String description;
    String unite;

    public int getId() {
        return id;
    }

    public Type setId(int id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Type setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getUnite() {
        return unite;
    }

    public Type setUnite(String unite) {
        this.unite = unite;
        return this;
    }
}