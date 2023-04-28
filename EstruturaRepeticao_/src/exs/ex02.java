package exs;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idade = 0;
		int cont = 0;
		double somaIdade = 0;
		double media = 0;
		
		
		while (idade >= 0) {
			System.out.println("Digite as idades: ");
			idade = sc.nextInt();
			
			if (idade > 0) {
				somaIdade = somaIdade + idade;
				cont ++;
			}
		}
		if (cont == 0 && idade < 0) {
			System.out.println("Impossível calcular");
		}else {
			media = somaIdade /cont;
				System.out.printf("Media = %.2f",media);
		}	
		sc.close();

	}

}
