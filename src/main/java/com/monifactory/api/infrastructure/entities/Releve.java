package com.monifactory.api.infrastructure.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
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
    
    private LocalDate dateTheorique;
    private short heureTheorique;
    private short minuteTheorique;
    private Float conso;

    @ManyToOne
    @JoinColumn(name = "id_machine", referencedColumnName = "id")
    private Machine machine;

    public Releve() {
    }

    public Releve(int id, Type type, ZonedDateTime dateReleve, LocalDate dateTheorique, short heureTheorique,
            short minuteTheorique, Float conso) {
        this.id = id;
        this.type = type;
        this.dateReleve = dateReleve;
        this.dateTheorique = dateTheorique;
        this.heureTheorique = heureTheorique;
        this.minuteTheorique = minuteTheorique;
        this.conso = conso;
    }

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
    public LocalDate getDateTheorique() {
        return dateTheorique;
    }

    public void setDateTheorique(LocalDate dateTheorique) {
        this.dateTheorique = dateTheorique;
    }
    
    public short getHeureTheorique() {
        return heureTheorique;
    }

    public void setHeureTheorique(short heureTheorique) {
        this.heureTheorique = heureTheorique;
    }
    public short getMinuteTheorique() {
        return minuteTheorique;
    }

    public void setMinuteTheorique(short minutesTheoriques) {
        this.minuteTheorique = minutesTheoriques;
    }

}