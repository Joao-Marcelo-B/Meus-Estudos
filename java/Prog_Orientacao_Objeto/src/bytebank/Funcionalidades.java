package bytebank;

public interface Funcionalidades {

	public abstract void abrirConta(int numConta, String tipo, String titular);
	public abstract void fecharConta();
	public abstract void depositar(double valorDeDeposito);
	public abstract void sacar(double valorDeSaque);
	public abstract void pagarMensal();
}
