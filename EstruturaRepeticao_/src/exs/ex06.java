package exs;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int codigo = 0;
		Scanner sc = new Scanner(System.in);
		
		while(codigo != 4) {
			System.out.println("1 = Álcool");
			System.out.println("2 = Gasolina");
			System.out.println("3 = Diesel");
			System.out.println("4 = Fim");
			System.out.print("Informe um codigo: ");
			codigo = sc.nextInt();
			if (codigo < 1 || codigo > 4) {
				System.out.println("Erro! Digite outro codigo");
				codigo = sc.nextInt();
			}
			if (codigo == 1) {
				alcool = alcool +1;
			}else if(codigo == 2) {
				gasolina = gasolina +1;
			}else if (codigo == 3) {
				diesel = diesel + 1;
			}else {
				System.out.println("MUITO OBRIGADO");
			}
		}
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}

}
