package aula02;

public class Roteador {
	
	String marca;
	String tipo_de_sinal;
	int antenas;
	boolean ligado;
	
	void status() {
		System.out.println("On/Off: " + this.ligado);
		System.out.println("Tipo de Sinal: " + this.tipo_de_sinal);
	}
	
	void ligar() {
		if(this.ligado) {
			System.out.println("O roteador já está ligado.");
		} else {
			this.ligado = true;
		}
	}
	
	void desligar() {
		if(this.ligado == false) {
			System.out.println("O roteador já está desligado.");
		} else {
			this.ligado = false;
		}
	}
	
	void TrocarSinal(String sinal) {
		this.tipo_de_sinal = sinal;
	}
}
