package exs;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0, y =1;
		
		
		while (x != y) {
			System.out.println("Digite dois numeros: ");
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (x > y) {
				System.out.println("DECRESENTE!");
			}else {
				System.out.println("CRESENTE!");
			}
			
		}
		sc.close();

	}

}
