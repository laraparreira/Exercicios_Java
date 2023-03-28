import java.util.Locale;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		float nota1 = sc.nextFloat();
		System.out.print("Digite a sengunda nota: ");
		float nota2 = sc.nextFloat();
		
		float somaNota = nota1 + nota2;
		if (somaNota < 60) {
			System.out.println("REPROVADO");
		}else {
			System.out.printf("NOTA FINAL = %.1f", somaNota);
		}
		
		sc.close();

	}

}
