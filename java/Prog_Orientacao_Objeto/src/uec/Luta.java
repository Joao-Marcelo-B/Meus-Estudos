package uec;

public class Luta {

	private Lutadores desafiado;
	private Lutadores desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutadores lutador1, Lutadores lutador2) {
		if(lutador1.getCategoria() == lutador2.getCategoria() && lutador1.getNome() != lutador2.getNome()) {
				this.aprovada = true;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
			
		}
	}
	public void lutar() {
		if(this.aprovada) {
			this.desafiado.apresentar();
			this.desafiante.apresentar();
			
		} else {
			System.out.println("Luta nao pode acontecer.");
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
	public boolena getAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
}
