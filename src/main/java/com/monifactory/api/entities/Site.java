package com.monifactory.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.List;
@Entity
public class Site {
    @Id
    private int id;
    private String libelle;
    @OneToMany
    @JoinColumn(name = "id_site", referencedColumnName = "id")
    private List<Chaine> chaines;

    public int getId() {
        return id;
    }

    public Site setId(int id) {
        this.id = id;
        return this;
    }

    public String getLibelle() {
        return libelle;
    }

    public Site setLibelle(String libelle) {
        this.libelle = libelle;
        return this;
    }

    public List<Chaine> getChaines() {
        return chaines;
    }

    public Site setChaines(List<Chaine> chaines) {
        this.chaines = chaines;
        return this;
    }
}
