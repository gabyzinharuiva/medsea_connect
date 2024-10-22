package br.edu.ifsp.bra.medsea.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public abstract class Cadastro {
    String nome;
    String cpf;
    String endereco;
    String email;
    int telefone;
    ArrayList<Depoimento> historicoDepoimentos = new ArrayList<Depoimento>();

    Cadastro(){
        this.nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        this.cpf = JOptionPane.showInputDialog("Digite o seu cpf: ");
        this.endereco = JOptionPane.showInputDialog("Digite o seu endereço: ");
        this.email = JOptionPane.showInputDialog("Digite o seu email: ");
        this.telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu telefone: "));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Depoimento> getHistoricoDepoimentos() {
        return historicoDepoimentos;
    }

    public void setHistoricoDepoimentos(ArrayList<Depoimento> historicoDepoimentos) {
        this.historicoDepoimentos = historicoDepoimentos;
    }

    @Override
    public String toString() {
        return "Cadastro [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", email=" + email + ", telefone="
                + telefone + ", historicoDepoimentos=" + historicoDepoimentos + "]";
    }

    
}
