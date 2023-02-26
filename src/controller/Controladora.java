package controller;

import javax.swing.JOptionPane;
import view.EntradaSaida;
import model.*;

public class Controladora {
	public static void titularConta() {
		Conta conta = new Conta();
		String usuario = EntradaSaida.usuarioConta();
		conta.setTitularConta(usuario);
		int tipoDeConta = EntradaSaida.tipoDeConta();
		conta.setTipoConta(tipoDeConta);
	}

	public static void exibeMenu() {
		int opcao;
		do {
			opcao = EntradaSaida.solicitaOpcao();
			switch (opcao) {
			case 0:
				Conta conta = new Conta(); 
				double depositar = EntradaSaida.solicitarInformacoesDeposito();
				break;

			case 1:

				break;

			case 2:

				break;

			case 3:

				break;
			}
		} while (opcao != 3);
		EntradaSaida.exibeMsgEncerraPrograma();
		System.exit(0);
	}
}
