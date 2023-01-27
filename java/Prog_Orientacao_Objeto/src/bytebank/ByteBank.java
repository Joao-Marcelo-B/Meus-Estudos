package bytebank;

public class ByteBank {
	
	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente();
		c1.abrirConta(1010, "CC", "Joao Marcelo");
		c1.estadoAtual();
		
		ContaCorrente c2 = new ContaCorrente();
		c2.abrirConta(1011, "CP", "Maria");
		c2.estadoAtual();
		
		c1.depositar(100);
		c2.depositar(500);
		c2.sacar(100);
		c1.sacar(150);
		c1.fecharConta();
		
                System.out.println("Não");
                
		c1.estadoAtual();
		c2.estadoAtual();
	}
}
