package br.edu.ifsp.bra.medsea.model;

import jakarta.persistence.Entity;

@Entity
public class Visitante extends Cadastro {

    public Visitante() {
        super();
    }

    @Override
    public String toString() {
        return "Visitante{} " + super.toString();
    }
}