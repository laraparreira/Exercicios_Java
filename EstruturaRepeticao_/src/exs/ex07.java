package exs;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		int x = 1;
		int armazenaX = 0;
		int contador = 0;
		int soma = 0;
		Scanner sc = new Scanner(System.in);
		
		while (x != 0) {
			System.out.print("Digite um número inteiro: ");
			x = sc.nextInt();
			armazenaX = x;
			if (x % 2 == 0) {
				soma = soma + x;
			}else {
				armazenaX = x + 1; //se os x for impar ira soamr mais para ficar sendo um numero par
				soma = soma + armazenaX;
			}
			while(contador < 5 ) {
				armazenaX = armazenaX +  2;
				soma = soma + armazenaX;
				contador++;
				
			}
			if(x == 0) 
				break;
			System.out.println("Soma: " + soma);
			contador = 1;
			soma = 0;
			
		}
		sc.close();
		

	}

}
