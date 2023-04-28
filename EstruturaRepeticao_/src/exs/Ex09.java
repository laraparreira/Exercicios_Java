package exs;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x, y;
		int soma = 0;
        System.out.print("Digite os valores: ");
        x = sc.nextInt();
        y = sc.nextInt();

        for (int i = x + 1; i < y; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos números ímpares = " + soma);
    

		
		sc.close();

	}

}
