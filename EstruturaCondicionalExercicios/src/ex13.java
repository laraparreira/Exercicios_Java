import java.util.Locale;
import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor de X: ");
		float x = sc.nextFloat();
		System.out.print("Valor de Y: ");
		float y = sc.nextFloat();
		
		if (x > 0 && y > 0) {
			System.out.println("Q1");
		}else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}else if ( x == 0 && y == 0) {
			System.out.println("Origem");
		}else if (y == 0) {
			System.out.println("Eixo X");
		}else if (x == 0) {
			System.out.println("Eixo Y");
		}
		
		sc.close();

	}

}
