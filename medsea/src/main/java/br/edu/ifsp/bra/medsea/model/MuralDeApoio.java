package br.edu.ifsp.bra.medsea.model;

import javax.swing.JOptionPane;

public class MuralDeApoio {
    String tituloComentario;
    String conteudoComentario;
    

    MuralDeApoio(){
        this.tituloComentario = JOptionPane.showInputDialog("Digite o título do comentário que irá escrever: ");
        this.conteudoComentario = JOptionPane.showInputDialog("Digite o seu comentário: ");
    }


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
