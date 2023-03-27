package exerciciosJavaPOO;

import java.util.Locale;
import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Valor por hora: ");
		int valorHora = sc.nextInt();
		
		System.out.print("Horas trabalhadas: ");
		int horaTrabalhada = sc.nextInt();
		
		int pagamento = valorHora * horaTrabalhada;
		
		System.out.printf("O pagamento para " + nome + " deve ser " + pagamento);
		
		sc.close();

	}

}
