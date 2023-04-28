package exs;

import java.util.Locale;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		float mediaPonderada;
		
		System.out.print("Quantos casos voce vai digitar? ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite tres nuemros: ");
			float n1 = sc.nextFloat();
			float n2 = sc.nextFloat();
			float n3 = sc.nextFloat();
			
			mediaPonderada = ((n1*2)+(n2*3)+(n3*5))/(2+3+5);
			System.out.printf("Media = %.1f \n", mediaPonderada);
			
		}
		sc.close();

	}

}
