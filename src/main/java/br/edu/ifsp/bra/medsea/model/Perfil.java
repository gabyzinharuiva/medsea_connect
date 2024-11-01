package br.edu.ifsp.bra.medsea.model;

import javax.swing.JOptionPane;

public class Perfil {
    String nomeUsuario;
    String bioUsuario;

    public Perfil(){
        //this.nomeUsuario = JOptionPane.showInputDialog("Digite o seu nome de usuário: ");
        //this.bioUsuario = JOptionPane.showInputDialog("Escreva uma pequena descrição sobre você: ");
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getBioUsuario() {
        return bioUsuario;
    }

    public void setBioUsuario(String bioUsuario) {
        this.bioUsuario = bioUsuario;
    }

    @Override
    public String toString() {
        return "Perfil [nomeUsuario=" + nomeUsuario + ", bioUsuario=" + bioUsuario + "]";
    }

    

}
