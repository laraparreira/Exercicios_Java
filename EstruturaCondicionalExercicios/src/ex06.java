import java.util.Locale;
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a medida da glicose: ");
		float glicose = sc.nextFloat();
		
		if (glicose <= 100 ) {
			System.out.println("Classificação: normal ");
		}else if (glicose > 100 && glicose <= 140) {
			System.out.println("Classificação: elevado");
		}else if (glicose > 140) {
			System.out.println("Classificação: diabetes");
		}
		
		sc.close();
		
	}

}
