package aula04;

public class Aula04 {

	public static void main(String[] args) {
		
		//Caneta c1 = new Caneta("Nic", "Amarela", 0.4f);
		//c1.status();
		
		//Caneta c2 = new Caneta("Kik","Laranja", 1.5f);
		//c2.status();
		
		Impressora imp1 = new Impressora("Xerox", "Pó", 50, true);
		imp1.status();
		System.out.println();
		//imp1.desligar();
		imp1.imprimir();
		
		Beber p = new Beber("Coca", 20, true);
		p.status();
	}
}
