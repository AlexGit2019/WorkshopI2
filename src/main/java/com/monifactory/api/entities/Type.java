package com.monifactory.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Type")
public class Type {
    @Id
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