package uec;

public class Lutadores implements Metodos{
	
	private String nome, nacionalidade, categoria;
	private int idade;
	private float altura, peso;
	private int vitorias, derrotas, empates;
	
	public Lutadores(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
		
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.setPeso(peso);
		this.altura = altura;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	
	@Override
	public void apresentar() {
		System.out.println("CHEGOU A HORA! Apresentados o lutador " + this.getNome());
		System.out.println("Diretamente de " + this.getNacionalidade());
		System.out.print("com " + this.getIdade()+ " anos e ");
		System.out.println(this.getAltura() + "m de altura");
		System.out.println("Pesando " + this.getPeso() + "Kg");
		System.out.println("Ganhou: " + this.getVitorias());
		System.out.println("Perdeu: " + this.getDerrotas());
		System.out.println("Empatou: " + this.getEmpates());
	}
	@Override
	public void status() {
		
		System.out.println(getNome());
		System.out.println("eh um peso " + this.getCategoria());
		System.out.println(this.getVitorias() + " vitorias");
		System.out.println(this.getDerrotas() + " derrotas");
		System.out.println(this.getEmpates() + " empates");
	}
	@Override
	public void ganharLuta() {
		
		this.setVitorias(this.getVitorias() + 1);
	}
	@Override
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	@Override
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		
		if(this.getPeso() < 52.2) {
			this.categoria = "Invalido";
		} else if(peso <= 70.3) {
			this.categoria = "Leve";
		} else if(peso <= 83.9) {
			this.categoria = "Medio";
		} else if(peso <= 120.2){
			this.categoria = "Pesado";
		} else {
			this.categoria = "Invalido";
		}
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
}
