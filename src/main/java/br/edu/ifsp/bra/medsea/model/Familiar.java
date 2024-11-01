package br.edu.ifsp.bra.medsea.model;

import javax.swing.JOptionPane;

public class Familiar extends Cadastro {
    int cartaoSUSFamiliar;
    int  convenioFamiliar;
    Paciente paciente;

    Familiar(){
        super();
        //this.cartaoSUSFamiliar= Integer.parseInt(JOptionPane.showInputDialog("Digite o número do seu cartão do SUS: "));
        //String possuiOuNao = JOptionPane.showInputDialog("Você possuí convênio? Digite 'S' para sim e 'N' para não: ");
        //if (possuiOuNao == "S" || possuiOuNao == "s"){
        //    convenioFamiliar = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do convênio: "));
        //} else{
        //    convenioFamiliar = 0;
        //}

        //JOptionPane.showMessageDialog(null, " Preencha com os dados do seu respectivo familiar agora ");
        //this.paciente = new Paciente();
    }

    public int getCartaoSUSFamiliar() {
        return cartaoSUSFamiliar;
    }

    public void setCartaoSUSFamiliar(int cartaoSUSFamiliar) {
        this.cartaoSUSFamiliar = cartaoSUSFamiliar;
    }

    public int getConvenioFamiliar() {
        return convenioFamiliar;
    }

    public void setConvenioFamiliar(int convenioFamiliar) {
        this.convenioFamiliar = convenioFamiliar;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Familiar [cartaoSUSFamiliar=" + cartaoSUSFamiliar + ", convenioFamiliar=" + convenioFamiliar
                + ", paciente=" + paciente + "]";
    }

    

}
