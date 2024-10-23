package br.edu.ifsp.bra.medsea.model;


public class MuralDeApoio {
    String tituloComentario;
    String conteudoComentario;

    public String getTituloComentario() {
        return tituloComentario;
    }


    public void setTituloComentario(String tituloComentario) {
        this.tituloComentario = tituloComentario;
    }


    public String getConteudoComentario() {
        return conteudoComentario;
    }


    public void setConteudoComentario(String conteudoComentario) {
        this.conteudoComentario = conteudoComentario;
    }


    @Override
    public String toString() {
        return "MuralDeApoio [tituloComentario=" + tituloComentario + ", conteudoComentario=" + conteudoComentario
                + "]";
    }

    
}
