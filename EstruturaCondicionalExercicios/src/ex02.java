import java.util.Locale;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Coeficiente a: ");
		float a = sc.nextFloat();
		System.out.print("Coeficiente b: ");
		float b = sc.nextFloat();
		System.out.print("Coeficiente c: ");
		float c = sc.nextFloat();
		
		double delta = Math.pow(b, 2) - (4*a*c);
		double x1 = ((- b + Math.sqrt(delta))/2*a);
		double x2 = ((- b - Math.sqrt(delta))/2*a);
		if (delta <= 0) {
			System.out.println("Esta equação não possui raízes reais");
		}else {
		
			System.out.printf("X1 = %.4f \n", x1);
			System.out.printf("X2 = %.4f \n", x2);
			sc.close();
		}

	}

}
