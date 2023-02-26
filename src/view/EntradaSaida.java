package view;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static String usuarioConta() {
		String nome = JOptionPane.showInputDialog("Insira seu nome de usuário da conta: ");
		return nome;
	}

	public static int tipoDeConta() {
		String opcoes[] = { "Conta corrente", "Conta poupança" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	public static int solicitaOpcao() {
		String opcoes[] = { "Depositar", "Sacar", "Gerar saldo", "Dados da conta", "Extrato", "Extrato de depositos",
				"Extrato de saques" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	public static double solicitarInformacoesDeposito() {
		double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor a ser depositado: "));
		return valorDeposito;
	}

	public static void exibeMsgEncerraPrograma() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado! ");
	}
}
