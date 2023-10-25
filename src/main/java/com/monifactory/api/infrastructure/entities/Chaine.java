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
    
    @ManyToOne
    @JoinColumn(name = "id_site", referencedColumnName = "id")
    private Site site;

    @OneToMany(mappedBy = "chaine")
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
    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
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
