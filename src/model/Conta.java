package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Conta {
	private String titularConta;
	private int tipoConta;
	private double saldo;
	private ArrayList<Movimentacao> listaDeMovimentacao;

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

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ArrayList<Movimentacao> getListaDeMovimentacao() {
		return listaDeMovimentacao;
	}

	public void setListaDeMovimentacao(ArrayList<Movimentacao> listaDeMovimentacao) {
		this.listaDeMovimentacao = listaDeMovimentacao;
	}

	/*
	 * public double depositar() {
	 * 
	 * }
	 * 
	 * public double sacar() {
	 * 
	 * }
	 * 
	 * public double gerarSaldo() {
	 * 
	 * }
	 * 
	 * public double gerarExtrato() {
	 * 
	 * }
	 * 
	 * public double gerarExtratoDepositos() {
	 * 
	 * }
	 * 
	 * public double gerarExtratoSaques() {
	 * 
	 * }
	 */

}
