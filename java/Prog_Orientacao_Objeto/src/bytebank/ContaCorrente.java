package bytebank;

public class ContaCorrente {
	public String numConta;
	protected String tipo;   //CC - Conta Corrente //CP - Conta Poupança
	private String titular;
	private double saldo;
	private boolean status;
	
	public void abrirConta(String numConta, String tipo, String titular, boolean status) {
		this.numConta = numConta;
		this.tipo = tipo;
		this.titular = titular;
		this.status = status;
		 
		if(this.tipo == "CC" ) {
			this.saldo = 50;
		} else {
			if(this.tipo == "CP") {
				this.saldo = 150;
			}
		 }
	}
	
	/*public void fecharConta() {
		
	}*/
	
	public void depositar(double valorDeDeposito) {
		
		if(this.status) {
			this.saldo += valorDeDeposito;
		} else {
			System.out.println("Essa conta não existe ou está inátiva.");
		}
	}
	
	public void sacar(double valorDeSaque) {
		
		if(this.status && this.saldo > 0 && (this.saldo - valorDeSaque) >= 0) {
			this.saldo -= valorDeSaque;
		} else {
			System.out.println("Nao foi possível fazer o saque.");
		}
	}
	
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void getInformacoes() {
		System.out.println(this.numConta);
		System.out.println(this.tipo);
		
		System.out.println(this.titular);
		System.out.println(this.saldo);
	}
}












