package br.edu.ifsp.bra.medsea.model;

import javax.swing.JOptionPane;

public class Paciente extends Cadastro{
    int cartaoSUSPaciente;
    int convenioPaciente;

    Paciente(){
        super();
        //this.cartaoSUSPaciente = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do seu cartão do SUS: "));
        //String possuiOuNao = JOptionPane.showInputDialog("Você possuí convênio? Digite 'S' para sim e 'N' para não: ");
		//	if (possuiOuNao == "S" || possuiOuNao == "s"){
		//		convenioPaciente = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do convênio: "));
		//	} else{
		//		convenioPaciente = 0;
		//	}
						
    }

    public int getCartaoSUSPaciente() {
        return cartaoSUSPaciente;
    }

    public void setCartaoSUSPaciente(int cartaoSUSPaciente) {
        this.cartaoSUSPaciente = cartaoSUSPaciente;
    }

    public int getConvenioPaciente() {
        return convenioPaciente;
    }

    public void setConvenioPaciente(int convenioPaciente) {
        this.convenioPaciente = convenioPaciente;
    }

    @Override
    public String toString() {
        return "Paciente [cartaoSUSPaciente=" + cartaoSUSPaciente + ", convenioPaciente=" + convenioPaciente + "]";
    }

    
}
