package br.edu.ifsp.bra.medsea.model;

import jakarta.persistence.*;

@Entity
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String conteudo;

    @ManyToOne
    @JoinColumn(name = "mural_de_apoio_id")
    private MuralDeApoio muralDeApoio;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public MuralDeApoio getMuralDeApoio() {
        return muralDeApoio;
    }

    public void setMuralDeApoio(MuralDeApoio muralDeApoio) {
        this.muralDeApoio = muralDeApoio;
    }
}
