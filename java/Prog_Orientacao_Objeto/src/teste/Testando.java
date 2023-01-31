package teste;
import java.util.Scanner;

public class Testando {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.print("Entre com seu nome: ");
		nome = ler.nextLine();
		
		System.out.print("Entre com sua idade: ");
		idade = ler.nextInt();
		
		System.out.println(nome + " tem "+ idade + " anos");
		
		ler.close();
	}
}
