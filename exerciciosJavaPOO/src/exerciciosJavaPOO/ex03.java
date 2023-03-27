package exerciciosJavaPOO;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados da primeira pessoa: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Dados da segunda pessoa: ");
		sc.nextLine();
		System.out.print("Nome: ");
		String nome2 = sc.nextLine();
		
		System.out.print("Idade: ");
		int idade2 = sc.nextInt();
		
		float media = (idade + idade2)/2;
		
		System.out.printf("A idade média de " + nome + " e " + nome2 + " é de " + media +" anos");
		
		sc.close();
		
	}

}
