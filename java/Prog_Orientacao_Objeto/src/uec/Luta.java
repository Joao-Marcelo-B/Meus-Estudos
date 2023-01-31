package uec;

public class Luta {

	private Lutadores desafiado;
	private Lutadores desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta() {
		
	}
	public void lutar() {
		
	}
	
	public String getDesafiado() {
		return desafiado.getNome();
	}
	public void setDesafiado(String desafiado) {
		this.desafiado = desafiado;
	}
	public String getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(String desafiante) {
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
