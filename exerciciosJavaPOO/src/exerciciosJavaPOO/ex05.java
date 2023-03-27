package exerciciosJavaPOO;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Preço unitário do produto: ");
		float preco = sc.nextFloat();
		
		System.out.print("Quantidade comprada: ");
		float quant = sc.nextFloat();
		
		System.out.print("Dinheiro recebido: ");
		float dinheiro = sc.nextFloat();
		
		float valorPagar = preco * quant;
		float troco = dinheiro - valorPagar;
		
		System.out.printf("TROCO = %.2f", troco);
		
		sc.close();

	}

}
