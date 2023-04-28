package exs;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de X: ");
		int x = sc.nextInt();
		
		for (int i = 0; i <= x; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		sc.close();

	}

}
