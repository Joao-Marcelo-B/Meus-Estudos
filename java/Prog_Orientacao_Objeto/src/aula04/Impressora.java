package aula04;

public class Impressora {
	private String modelo;
	private String tipoDeTinta;
	private int carga;
	private boolean ligada;
	
	public Impressora(String modelo, String tipoDeTinta, int carga, boolean ligada) {
		this.modelo = modelo;
		this.tipoDeTinta = tipoDeTinta;
		this.carga = carga;
		this.ligada = ligada;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getTipoDeTinta() {
		return this.tipoDeTinta;
	}
	public void setTipoDeTinta(String tipoDeTinta) {
		this.tipoDeTinta = tipoDeTinta;
	}
	
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public boolean getLigada() {
		return this.ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	public void ligar() {
		this.ligada = true;
	}
	public void desligar() {
		this.ligada = false;
	}
	
	public void imprimir() {
		if(this.ligada) {
			System.out.println("Imprimindo...");
		} else {
			System.out.println("Ligue a impressora primeiro.");
		}
	}
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Tipo de tinta: " + this.tipoDeTinta);
		System.out.println("Carga: " + this.carga);
		System.out.println("On/Off: " + this.ligada);
	}
	
	
}
