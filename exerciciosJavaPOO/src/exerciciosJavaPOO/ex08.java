package exerciciosJavaPOO;

import java.util.Locale;
import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Distância percorrida: ");
		int distancia = sc.nextInt();
		
		System.out.print("Combustível gasto: ");
		float combustivel = sc.nextFloat();
		
		float  consumoMedio = distancia / combustivel;
		
		System.out.printf("Consumo médio = %.3f", consumoMedio);
		sc.close();

	}

}
