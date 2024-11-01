package br.edu.ifsp.bra.medsea.model;

import org.springframework.data.annotation.Id;

public class Depoimento {
    @Id
    private Long id;
    private String tituloDepoimento;
    private String conteudoDepoimento;
    private Long usuarioId;

    public Depoimento(Long id, String tituloDepoimento, String conteudoDepoimento, Long usuarioId) {
        this.id = id;
        this.tituloDepoimento = tituloDepoimento;
        this.conteudoDepoimento = conteudoDepoimento;
        this.usuarioId = usuarioId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTituloDepoimento() {
        return tituloDepoimento;
    }

    public void setTituloDepoimento(String tituloDepoimento) {
        this.tituloDepoimento = tituloDepoimento;
    }

    public String getConteudoDepoimento() {
        return conteudoDepoimento;
    }

    public void setConteudoDepoimento(String conteudoDepoimento) {
        this.conteudoDepoimento = conteudoDepoimento;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }
}
