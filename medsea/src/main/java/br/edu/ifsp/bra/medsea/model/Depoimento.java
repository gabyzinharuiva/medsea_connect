package br.edu.ifsp.bra.medsea.model;

public class Depoimento {
    String tituloDepoimento;
    String conteudoDepoimento;
    

    Depoimento(){
        // this.tituloDepoimento = JOptionPane.showInputDialog("Digite o título do seu depoimento: ");
        // this.conteudoDepoimento = JOptionPane.showInputDialog("Digite o seu depoimento: ");
    }


    public Depoimento(String tituloDepoimento, String conteudoDepoimento) {
        this.tituloDepoimento = tituloDepoimento;
        this.conteudoDepoimento = conteudoDepoimento;
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


    @Override
    public String toString() {
        return "Depoimento [tituloDepoimento=" + tituloDepoimento + ", conteudoDepoimento=" + conteudoDepoimento + "]";
    }

    
    
}
