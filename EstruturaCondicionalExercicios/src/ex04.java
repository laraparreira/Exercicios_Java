import java.util.Locale;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de minutos: ");
		int minutos = sc.nextInt();
		
		if (minutos > 100) {
			float valor = (minutos - 100) *2 + 50;
			System.out.printf("Valor a pagar: R$ %.2f",  valor);
		}else {
			System.out.println("Valor a pagar: R$ 50.00");
			
		}
		sc.close();

	}

}
