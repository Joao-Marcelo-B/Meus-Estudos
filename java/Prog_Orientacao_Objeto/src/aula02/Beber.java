package aula02;

public class Beber {
	boolean hidratado;
	String liquido;
	int temperatura;
	boolean prontoParaConsumir;
	
	void consumir() {
		
		if(this.hidratado) {
			System.out.println("Já estou hidratado.");
		} else {
			if(this.prontoParaConsumir) {
				this.hidratado = true;
				System.out.println("Agora você está hidratado.");
			}
		}
	}
	
	void liquidoAdequado() {
		if(temperatura <= 5 && temperatura >= 0) {
			System.out.println("O liquido pode ser consumido.");
			this.prontoParaConsumir = true;
		} else {
			System.out.println("O liquido não pode ser consumido.");
			this.prontoParaConsumir = false;
		}
	}
	
	void diminuirTemperatura() {
		if(!this.prontoParaConsumir) {
			this.temperatura = 0;
			this.prontoParaConsumir = true;
		}
	}
}
