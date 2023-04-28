package exs;

import java.util.Locale;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
	     Scanner sc = new Scanner(System.in);
	     int fatoral = 1;
	     System.out.print("Digite o valor de N: ");
	     int n = sc.nextInt();
	     
	     for (int i = n; i >= 1; i--) {
	    	 fatoral = fatoral *  i;
	     }
	     System.out.println("FATORAL = " + fatoral);
	     sc.close();

	}

}
