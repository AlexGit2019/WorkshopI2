package com.monifactory.api.infrastructure.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Modele")
public class Modele {
    @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String libelle;
    @OneToMany
    @JoinColumn(name = "id_modele", referencedColumnName = "id")
    private List<ConsommationNormale> consommationNormale;

    public int getId() {
        return id;
    }

    public Modele setId(int id) {
        this.id = id;
        return this;
    }

    public String getLibelle() {
        return libelle;
    }

    public Modele setLibelle(String libelle) {
        this.libelle = libelle;
        return this;
    }

    public List<ConsommationNormale> getConsommationNormale() {
        return consommationNormale;
    }

    public Modele setConsommationNormale(List<ConsommationNormale> consommationNormale) {
        this.consommationNormale = consommationNormale;
        return this;
    }
}
