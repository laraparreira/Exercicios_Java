import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2, valor3;
		System.out.println("Primeiro valor: ");
		valor1 = sc.nextInt();
		System.out.println("Primeiro valor: ");
		valor2 = sc.nextInt();
		System.out.println("Primeiro valor: ");
		valor3 = sc.nextInt();
		
		if(valor1 < valor2 && valor1 < valor3) {
			System.out.println("MENOR = "+ valor1);
		}else if (valor2 < valor1 && valor2 < valor3) {
			System.out.println("MENOR = " + valor2);
		}else if (valor3 < valor1 && valor3 < valor3) {
			System.out.println("MENOR = " + valor3);
		}
		
		if(valor1 == valor2 || valor1 == valor3) {
			System.out.println("MENOR = "+ valor1);
		}else if (valor2 == valor1 || valor2 == valor3) {
			System.out.println("MENOR = " + valor2);
		}else if (valor3 == valor1 || valor3 == valor2) {
			System.out.println("MENOR = " + valor3);
		}
		
		
		sc.close();

	}

}
