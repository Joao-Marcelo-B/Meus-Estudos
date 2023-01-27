package bytebank;

public class ContaCorrente implements Funcionalidades{
	private int numConta;
	protected String tipo;   //CC - Conta Corrente //CP - Conta Poupança
	private String titular;
	private double saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Titular: " + this.getTitular());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
		System.out.println("------------------------------");
	}
	
	public ContaCorrente() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	@Override
	public void abrirConta(int numConta, String tipo, String titular) {
		this.setNumConta(numConta);
		this.setTipo(tipo);
		this.setTitular(titular);
		this.setStatus(true);
		 
		if(this.tipo == "CC") {
			this.setSaldo(50);
		} else if(this.tipo == "CP") {
				this.setSaldo(150);
			}
		System.out.println("Conta aberta com sucesso.");
	}
	
	@Override
	public void fecharConta() {
		if(this.saldo > 0) {
			
			System.out.println("Para fechar a conta você deve sacar todo seu saldo.");
		} else if(this.saldo < 0) {
				System.out.println("Para fechar a conta você deve depositar o saldo devedor.");
			} else {
				this.status = false;
				System.out.println("Sua conta foi fechada com sucesso.");
			}
	}
	
	@Override
	public void depositar(double valorDeDeposito) {
		
		if(this.getStatus()) {
			setSaldo(getSaldo() + valorDeDeposito);
			System.out.println("Deposito realicado na conta: " + this.getNumConta());
		} else {
			System.out.println("Essa conta não existe ou está inátiva.");
		}
	}
	
	@Override
	public void sacar(double valorDeSaque) {
		
		if(this.getStatus()) {
			if(this.getSaldo() >= valorDeSaque) {
				this.setSaldo(this.getSaldo() - valorDeSaque);
				System.out.println("Saque realizado na conta de: " + this.getNumConta());
			} else {
				System.out.println("Saldo Insuficiente.");
			}
			
		} else {
			System.out.println("A conta está inátiva.");
		}
	}
	
	@Override
	public void pagarMensal() {
		float valor = 0;
		if(this.tipo == "CC") {
			valor = 12;
		} else {
			if(this.tipo == "CP") {
				valor = 20;
			}
		}
		
		if(this.getStatus()) {
			if(this.getSaldo() > valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Mensalidade paga com sucesso.");
			} else {
				System.out.println("Impossivel pagar.");
			}
		}
	}
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
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
	
}












