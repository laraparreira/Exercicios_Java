import java.util.Locale;
import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc  = new Scanner(System.in);
		
		double salario, novoSalario, aumento;
		
		System.out.print("Digite o salario da pessoa: ");
		salario = sc.nextDouble();
		
		if (salario <= 1000) {
			novoSalario = salario + (salario * 0.2) ;
			aumento = salario * 0.2;
			System.out.printf("Novo salário = R$ %.2f \n", novoSalario);
			System.out.printf("Aumento = R$ %.2f \n", aumento);
			System.out.printf("Porcentagem = 20");
		}else if (salario > 1000 && salario <= 3000) {
			novoSalario = salario + (salario * 0.15) ;
			aumento = salario * 0.15;
			System.out.printf("Novo salário = R$ %.2f \n", novoSalario);
			System.out.printf("Aumento = R$ %.2f \n", aumento);
			System.out.printf("Porcentagem = 15");
		}else if (salario > 3000 && salario <= 8000) {
			novoSalario = salario + (salario * 0.1) ;
			aumento = salario * 0.1;
			System.out.printf("Novo salário = R$ %.2f \n", novoSalario);
			System.out.printf("Aumento = R$ %.2f \n", aumento);
			System.out.printf("Porcentagem = 10");
		}else if (salario > 8000) {
			novoSalario = salario + (salario * 0.05) ;
			aumento = salario * 0.05;
			System.out.printf("Novo salário = R$ %.2f \n", novoSalario);
			System.out.printf("Aumento = R$ %.2f \n", aumento);
			System.out.printf("Porcentagem = 5");
		}
		sc.close();

	}

}
