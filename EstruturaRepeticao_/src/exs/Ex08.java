package exs;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		System.out.print("Deseja a tabuada para qual valor? ");
		n = sc.nextInt();
		
		for (int i = 1; i < 11; i++) {
			int tabuada = n * i;
			System.out.println(n + " x " + i + " = " + tabuada);
		}
		sc.close();

	}

}
