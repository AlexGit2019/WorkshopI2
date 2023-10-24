package com.monifactory.api.infrastructure.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Machine")
public class Machine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_modele", referencedColumnName = "id")
    private Modele modele;
    @OneToMany
    @JoinColumn(name = "id_machine", referencedColumnName = "id")
    private List<Releve> releves;

    public int getId() {
        return id;
    }

    public Machine setId(int id) {
        this.id = id;
        return this;
    }

    public Modele getModele() {
        return modele;
    }

    public Machine setModele(Modele modele) {
        this.modele = modele;
        return this;
    }

    public List<Releve> getReleves() {
        return releves;
    }

    public Machine setReleves(List<Releve> releves) {
        this.releves = releves;
        return this;
    }
}
