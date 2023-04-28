package exs;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int senha = 0;
		
		while (senha != 2002) {
			System.out.print("DIgite a senha: ");
			senha = sc.nextInt();
			
			if (senha != 2002) {
				System.out.print("Senha Invalida! Tente Novamente: ");
			}
			
		}
		System.out.println("Acesso permitido!");
		sc.close();

	}

}
