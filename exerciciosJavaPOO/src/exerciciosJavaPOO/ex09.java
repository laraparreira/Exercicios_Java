package exerciciosJavaPOO;

import java.util.Locale;
import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float a, b, c;
		
		System.out.print("Digite a medida A: ");
		a = sc.nextFloat();
		System.out.print("Digite a medida B: ");
		b = sc.nextFloat();
		System.out.print("Digite a medida C: ");
		c = sc.nextFloat();
		
		double areaQuadrado = Math.pow(a, 2);
		double areaTriangulo = (b*a)/2;
		double areaTrapezio = (a+b)/2 *c;
		
		System.out.printf("ÁREA DO QUADRADO = %.3f \n", areaQuadrado);
		System.out.printf("ÁREA DO TRIÂNGULO = %.3f \n", areaTriangulo);
		System.out.printf("ÁREA DO TRAPÉZIO = %.3f \n", areaTrapezio);
		
		sc.close();
		

	}

}
