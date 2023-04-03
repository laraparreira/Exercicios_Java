import java.util.Locale;
import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		char caractere;
		
		double c,f, temperatura;
		
		System.out.println("Você vai digitar a temperatura em qual escala (C/F) ?");
		caractere = sc.next().charAt(0);
		
		if (caractere == 'C' || caractere == 'c') {
			System.out.printf("Digite a temperatura em Celsius: ");
			temperatura = sc.nextDouble();
			f = (temperatura * 1.8) + 32;
			System.out.printf("Temperatura equivalente em Celsius: %.2f ", f);
			
		}else if (caractere == 'F' || caractere == 'f') {
			System.out.printf("Digite a temperatura em Fahrenheit: ");
			temperatura = sc.nextDouble();
			c = (temperatura - 32) * 5/9;
			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", c);
		}
		sc.close();

	}

}
