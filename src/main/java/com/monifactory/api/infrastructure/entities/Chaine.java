package com.monifactory.api.infrastructure.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "chaine")
public class Chaine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String libelle;
    @OneToMany
    @JoinColumn(name = "id_chaine", referencedColumnName = "id")
    private List<Machine> machines;

    public int getId() {
        return id;
    }

    public Chaine setId(int id) {
        this.id = id;
        return this;
    }

    public String getLibelle() {
        return libelle;
    }

    public Chaine setLibelle(String libelle) {
        this.libelle = libelle;
        return this;
    }

    public List<Machine> getMachines() {
        return machines;
    }

    public Chaine setMachines(List<Machine> machines) {
        this.machines = machines;
        return this;
    }
}
