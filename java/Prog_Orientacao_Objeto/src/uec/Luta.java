package uec;

import java.util.Random;

public class Luta {

	private Lutadores desafiado;
	private Lutadores desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutadores lutador1, Lutadores lutador2) {
		if(lutador1.getCategoria() == lutador2.getCategoria() 
				&& lutador1.getNome() != lutador2.getNome()) {
				this.aprovada = true;
				this.desafiado = lutador1;
				this.desafiante = lutador2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	public void lutar() {
		if(this.aprovada) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			
			switch (vencedor) {
			case 0:
				System.out.println("Empatou!!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1:
				System.out.println("Vitória do " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2:
				System.out.println("Vitória do " + this.desafiante.getNome());
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;
			}
		} else {
			System.out.println("A luta nao pode acontecer.");
		}
	}
	
	public Lutadores getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutadores desafiado) {
		this.desafiado = desafiado;
	}
	public Lutadores getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutadores desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean getAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
}
