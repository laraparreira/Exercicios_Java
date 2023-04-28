package exs;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dentro = 0, fora = 0;
		int numero, n;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		numero = sc.nextInt();
		
		for(int i = 1; i <= numero; i++) {
			System.out.print("Digite um nuemro:");
			n = sc.nextInt();
			
			if (n >= 10 && n <= 20) {
				dentro += 1;
			}else {
				fora += 1;
			}
		}
		System.out.println(dentro + " Dentro");
		System.out.println(fora + " Fora");
		sc.close();

	}

}
