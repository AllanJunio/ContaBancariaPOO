package model;

import view.EntradaSaida;
import java.util.ArrayList;

public class Conta {
	private String titularConta;
	private int tipoConta;
	private double saldo;
	private ArrayList<Movimentacao> listaDeMovimentacao = new ArrayList<Movimentacao>();

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public int getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}

	public double getSaldo() {

		return saldo;

	}

	public void setSaldo(double saldo, String df) {
		this.saldo = saldo;
	}

	public ArrayList<Movimentacao> getListaDeMovimentacao() {
		return listaDeMovimentacao;
	}

	public void setListaDeMovimentacao(ArrayList<Movimentacao> listaDeMovimentacao) {
		this.listaDeMovimentacao = listaDeMovimentacao;
	}

	public void depositar(double depositar) {

		saldo = saldo + depositar;

	}

	public void sacar(double saque) {
		saldo = saldo - saque;
		if (saldo <= -1000) {
			EntradaSaida.saldoNegativo();
			this.saldo = -1000;
		}
	}

	public double gerarSaldo(double sacar, double depositar) {
		double saldoConta = (depositar - sacar);
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setValor(saldoConta);
		if (saldoConta <= 1000) {
			EntradaSaida.saldoNegativo();
		}
		return saldoConta;
	}

	public void gerarExtrato() {
//Fazer um for, percorrer o Array para vizualizar os itens, e posteriormente usar para exibir no EntradaSaida 

		for (int i = 0; i < listaDeMovimentacao.size(); i++) {
			listaDeMovimentacao.get(i);
			String infoExtrato = listaDeMovimentacao.get(i).getData() + "\n"
					+ listaDeMovimentacao.get(i).getTipoMovimentacao() + "\n" + listaDeMovimentacao.get(i).getValor();
			EntradaSaida.visualizaExtrato(infoExtrato);
			//infoExtrato += "----------------------------";
		}

	}

	public void geraMovimentacao(Movimentacao movimentacao) {
		listaDeMovimentacao.add(movimentacao);
	}

	public void gerarExtratoSaques() {
		// Fazer conforme método abaixo (depois de estar validado)
		for (int i = 0; i < listaDeMovimentacao.size(); i++) {
			String infoExtratoSaque = listaDeMovimentacao.get(i).getData() + "\n" + "Saque: \n"
					+ listaDeMovimentacao.get(i).getvalorSaque();
			if (listaDeMovimentacao.get(i).getTipoMovimentacao().equals("Saque")) {
				EntradaSaida.visualizaExtrato(infoExtratoSaque);
				//infoExtratoSaque += "----------------------------";
			}
		}
	}

	public void gerarExtratoDepositos() {

		for (int i = 0; i < listaDeMovimentacao.size(); i++) {

			String infoExtratoDeposito = listaDeMovimentacao.get(i).getData() + "\n"
					+ listaDeMovimentacao.get(i).getTipoMovimentacao() + "\n"
					+ listaDeMovimentacao.get(i).getvalorDeposito();
			if (listaDeMovimentacao.get(i).getTipoMovimentacao().equals("Depósito")) {
				EntradaSaida.visualizaExtrato(infoExtratoDeposito);
				//infoExtratoDeposito += "----------------------------";

			}
		}

	}
}
