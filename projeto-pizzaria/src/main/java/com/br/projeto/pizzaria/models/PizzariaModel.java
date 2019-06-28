package com.br.projeto.pizzaria.models;

public class PizzariaModel {
	
	private String sabor;
	private String massa;
	private String bordaPizza;
	private double valor;
	
	public PizzariaModel() {
		
	}
	
	public PizzariaModel(String sabor, String massa, String bordaPizza, double valor) {
		this.sabor = sabor;
		this.massa = massa;
		this.bordaPizza = bordaPizza;
		this.valor = valor;

	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getBordaPizza() {
		return bordaPizza;
	}

	public void setBordaPizza(String bordaPizza) {
		this.bordaPizza = bordaPizza;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		
		modelo.append("Sabor da pizza : "+this.sabor+"\n");
		modelo.append("Massa da pizza : "+this.massa+"\n");
		modelo.append("Borda da pizza : "+this.bordaPizza+"\n");
		modelo.append("Valor da pizza : "+this.valor);
		
		return modelo.toString();
	}
	
	

}
