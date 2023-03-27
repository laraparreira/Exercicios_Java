package exerciciosJavaPOO;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a duração em segundos: ");
		int segundos = sc.nextInt();
		
		int horas = segundos / 3600;
		segundos %= 3600;
		int minutos = segundos / 60;
		segundos %= 60;
		
		
		System.out.printf("%s : %s : %s", horas, minutos, segundos);
		
		sc.close();

	}

}
