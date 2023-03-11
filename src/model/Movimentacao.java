package model;

public class Movimentacao {
	private String tipoMovimentacao; // passar para String
	private double valor;
	private String date;
	private double valorDeposito;
	private double valorSaque;

	public String getTipoMovimentacao() {
		return tipoMovimentacao;
	}

// Envio realizado da controladora 
	public void setTipoMovimentacao(String tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getData() {
		return date;
	}

	public void setData(String date) {
		this.date = date;
	}

	public double getvalorDeposito() {
		return valorDeposito;
	}

	public void setValorDeposito(double valorDeposito) {
		this.valorDeposito = valorDeposito;
	}

	public double getvalorSaque() {
		return valorSaque;
	}

	public void setValorSaque(double valorSaque) {
		this.valorSaque = valorSaque;
	}
}
