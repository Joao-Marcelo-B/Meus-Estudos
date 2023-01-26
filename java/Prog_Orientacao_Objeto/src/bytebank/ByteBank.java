package bytebank;

public class ByteBank {
	
	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente();
		c1.abrirConta(1010, "CC", "Joao Marcelo");
		c1.estadoAtual();
		
		ContaCorrente c2 = new ContaCorrente();
		c2.abrirConta(1011, "CP", "Maria");
		c2.estadoAtual();
	}
}
