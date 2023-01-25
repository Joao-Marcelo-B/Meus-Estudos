package aula04;

public class Beber {
	private String liquido;
	private int temperatura;
	private boolean hidratado;
	
	public Beber(String liquido, int temperatura, boolean hidratado) {
		this.liquido = liquido;
		this.temperatura = temperatura;
		this.hidratado = hidratado;
	}
	
	public String getLiquido() {
		return liquido;
	}
	public void setLiquido(String liquido) {
		this.liquido = liquido;
	}
	
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	public boolean isHidratado() {
		return hidratado;
	}
	public void setHidratado(boolean hidratado) {
		this.hidratado = hidratado;
	}
	
	public void status() {
		System.out.println("Liquido: " + this.liquido);
		System.out.println("Temperatura: " + this.temperatura);
		System.out.println("Hidratado: " + this.hidratado);
	}
	
}
