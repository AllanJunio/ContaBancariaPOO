package controller;

import java.util.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import view.EntradaSaida;
import model.*;

public class Controladora {

	public static void exibeMenu() {
		int opcao;
		EntradaSaida.msgInicial();
		Conta conta = new Conta();
		// Instancia��o para formata��o de data conforme o dia e hor�rio que o programa
		// for executado
		SimpleDateFormat formato = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy  '|' hh:mm:ss");
		String usuario = EntradaSaida.usuarioConta();
		conta.setTitularConta(usuario);
		int tipoDeConta = EntradaSaida.tipoDeConta();
		conta.setTipoConta(tipoDeConta);
		do {
			opcao = EntradaSaida.solicitaOpcao();
			switch (opcao) {

			case 0:
				// Instancia��o para deixar o n�mero formatado conforme desejado
				String df = new DecimalFormat("00.00").format(00.00);
				String tipoMovimentacao = "Dep�sito";
				double depositar = EntradaSaida.solicitarInformacoesDeposito();
				conta.depositar(depositar);
				Movimentacao movimentacao = new Movimentacao();
				Date date = new Date();
				movimentacao.setValorDeposito(depositar);
				movimentacao.setValor(depositar);
				movimentacao.setData(formato.format(date));
				movimentacao.setTipoMovimentacao(tipoMovimentacao);
				conta.geraMovimentacao(movimentacao);
				break;

			case 1:
				tipoMovimentacao = "Saque";
				df = new DecimalFormat("00.00").format(00.00);
				double saque = EntradaSaida.solicitaSaque();
				conta.sacar(saque);
				movimentacao = new Movimentacao();
				date = new Date();
				movimentacao.setValorSaque(saque);
				// Linha abaixo est� setando o valor para fazer o c�lculo do total
				movimentacao.setValor(saque);
				movimentacao.setData(formato.format(date));
				movimentacao.setTipoMovimentacao(tipoMovimentacao);
				conta.geraMovimentacao(movimentacao);
				break;

			case 2:

				double visualizadorSaldo = conta.getSaldo();
				EntradaSaida.exibeSaldo(visualizadorSaldo);

				break;

			case 3:
				// Necess�rio acrescentar os demais dados da conta
				String nomeUsuario = conta.getTitularConta();
				int tipoConta1 = conta.getTipoConta();
				String tipoDaConta;
				if (tipoConta1 == 0) {
					tipoDaConta = "Conta corrente";
				} else {
					tipoDaConta = "conta poupan�a";
				}
				double visualizaSaldo = conta.getSaldo();
				EntradaSaida.dadosDaConta(nomeUsuario, tipoDaConta, visualizaSaldo);

				break;

			case 4:
				conta.gerarExtrato();

				break;

			case 5:

				conta.gerarExtratoSaques();

				break;

			case 6:

				conta.gerarExtratoDepositos();

				break;
			}
		} while (opcao != 7);
		EntradaSaida.exibeMsgEncerraPrograma();
		System.exit(0);
	}
}
