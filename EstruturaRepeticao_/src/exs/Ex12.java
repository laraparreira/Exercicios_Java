package exs;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int numero;
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i ++) {
			System.out.print("Digite um numero: ");
			numero = sc.nextInt();
			
			if (numero % 2 == 0 && numero > 0) {
				System.out.println("PAR POSITIVO");
			}else if (numero % 2 == 0 && numero < 0) {
				System.out.println("PAR NEGATIVO");
			}else if (numero % 2 != 0 && numero > 0) {
				System.out.println("ÍMPAR POSITIVO");
			}else if (numero % 2 != 0 && numero < 0) {
				System.out.println("ÍMAPAR NEGATIVO");
			}else {
				System.out.println("NULO");
			}
		}
		sc.close();

	}

}
