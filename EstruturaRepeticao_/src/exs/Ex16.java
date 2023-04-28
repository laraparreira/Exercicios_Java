package exs;

import java.util.Locale;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char tipoCobaia; 
		int quantCobaias = 0, totalCobaia = 0, totalCoelho = 0, totalRato = 0, totalSapo = 0;
		float coelho = 0, rato = 0, sapo = 0;
		
		System.out.print("Quantos casos de teste serão digitados? ");
		int casos =  sc.nextInt();
		
		for(int i = 1; i <= casos; i++) {
			System.out.print("Quabtidade de cobaias: ");
			quantCobaias = sc.nextInt();
			System.out.print("Tipo de cobaias: ");
			tipoCobaia = sc.next().charAt(0);
			System.out.println("------------------------");
			
			totalCobaia = totalCobaia +  quantCobaias;
			
			if(tipoCobaia == 'C') {
				totalCoelho = totalCoelho  + quantCobaias;
			}else if(tipoCobaia == 'R') {
				totalRato = totalRato + quantCobaias;
			}else if (tipoCobaia == 'S') {
				totalSapo = totalSapo + quantCobaias;
			}
			coelho = (totalCoelho * 100)/totalCobaia;
			rato = (totalRato * 100)/totalCobaia;
			sapo = (totalSapo * 100)/totalCobaia;
		}
		
			System.out.println("RELATORIO FINAL ");
			System.out.println("Total : " + totalCobaia +  " cobaias");
			System.out.println("Total de coelhos: " + totalCoelho);
			System.out.println("Total de ratos : "+ totalRato);
			System.out.println("Total de sapos: " + totalSapo);
			System.out.printf("Percentual de coelhos : %.2f \n", coelho);
			System.out.printf("Percentual de ratos: %.2f \n" , rato);
			System.out.printf("Percentual de sapos: %.2f \n", sapo);
		
		
		sc.close();

	}

}
