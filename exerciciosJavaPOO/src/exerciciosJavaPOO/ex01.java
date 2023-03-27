package exerciciosJavaPOO;

import java.util.Locale;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		float largura, comprimento, valor, area, preco; 
		
		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextFloat();
		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextFloat();
		System.out.print("Digite o valor do metro quadrado: ");
		valor = sc.nextFloat();
		
		area = largura * comprimento;
		preco = area * valor;
		
		System.out.printf("Área do terreno = %.2f \nl", area);
		System.out.printf("Preço do terreno = %.2f", preco);
		
		
		sc.close();

	}

}
