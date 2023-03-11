package view;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static void msgInicial() {
		JOptionPane.showMessageDialog(null, "Iniciaremos seu processo de cadastro da conta banc�ria! ");
	}

	public static String usuarioConta() {
		String nome = JOptionPane.showInputDialog("Insira seu nome de usu�rio da conta: ");
		return nome;
	}

	public static int tipoDeConta() {
		String opcoes[] = { "Conta corrente", "Conta poupan�a" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a op��o desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	public static int solicitaOpcao() {
		String opcoes[] = { "Depositar", "Sacar", "Gerar saldo", "Dados da conta", "Extrato", "Extrato de saques",
				"Extrato de depositos", "Sair do programa" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a op��o desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	public static double solicitarInformacoesDeposito() {
		double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor a ser depositado: "));
		return valorDeposito;
	}

	public static double solicitaSaque() {
		double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor para saque: "));
		return valorSaque;
	}

	public static void dadosDaConta(String nomeUsuario, String tipoDaConta, double visualizaSaldo) {
		JOptionPane.showMessageDialog(null, " Nome do titular da conta: " + nomeUsuario + "\n Tipo da conta: "
				+ tipoDaConta + "\n Seu saldo atual � de: " + visualizaSaldo);
	}

	public static void exibeSaldo(double visualizadorSaldo) {

		JOptionPane.showMessageDialog(null, "Seu saldo atual � de: " + visualizadorSaldo);
	}

	public static void visualizaExtrato(String informacoesExtrato) {
		JOptionPane.showMessageDialog(null, "" + informacoesExtrato);

	}

	public static void visualizaExtratoDeposito(String informacoesExtratoDeposito) {

	}

	public static void saldoNegativo() {
		JOptionPane.showMessageDialog(null,
				"Voc� n�o pode deixar seu saldo mais que R$1.000,00 negativo \n Seu saldo atual � de R$-1.000,00");
	}

	public static void exibeMsgEncerraPrograma() {
		JOptionPane.showMessageDialog(null, "O programa ser� encerrado! ");
	}
}
