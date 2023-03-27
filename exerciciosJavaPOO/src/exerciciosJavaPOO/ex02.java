package exerciciosJavaPOO;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double base, altura;
		
		System.out.print("Base do retenguo: ");
		base = sc.nextDouble();
		
		System.out.print("Altura do retangulo: ");
		altura = sc.nextDouble();
		
		double area = base * altura;
		double perimetro = base *2 + altura*2;
		double diag = Math.pow(altura,2) + Math.pow(base,2);
		double diagonal = Math.sqrt(diag);
		
		System.out.printf("ÁREA = %.4f \n",area);
		System.out.printf("PERÍMETRO = %.4f \n", perimetro);
		System.out.printf("DIAGONAL = %.4f \n ", diagonal);
		
		
		
		sc.close();

	}

}
