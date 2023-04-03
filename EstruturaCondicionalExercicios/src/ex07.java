import java.util.Locale;
import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float distancia1, distancia2, distancia3;
		
		System.out.println("Digite as tres distancias: ");
		distancia1 = sc.nextFloat();
		distancia2 = sc.nextFloat();
		distancia3 = sc.nextFloat();
		
		if (distancia1 > distancia2 && distancia1 > distancia3 ) {
			System.out.printf("MAIOR DISTÂNCIA  = %.2f", distancia1);
		}else if (distancia2 > distancia1 && distancia2 > distancia3 ) {
			System.out.printf("MAIOR DISTANCIA  = %.2f", distancia2);
		}else if (distancia3 > distancia1 && distancia3 > distancia2 ) {
			System.out.printf("MAIOR DISTANCIA  = %.2f", distancia3);
		}
		
		if (distancia1 == distancia2 && distancia1 == distancia3 ) {
			System.out.printf("MAIOR DISTÂNCIA  = %.2f", distancia1);
		}else if (distancia2 == distancia1 && distancia2 == distancia3 ) {
			System.out.printf("MAIOR DISTANCIA  = %.2f", distancia2);
		}else if (distancia3 == distancia1 && distancia3 == distancia2 ) {
			System.out.printf("MAIOR DISTANCIA  = %.2f", distancia3);
		}
		
		
		sc.close();
	}

}
