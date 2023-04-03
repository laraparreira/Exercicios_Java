import java.util.Locale;
import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double valorProduto, valorTotal;
		System.out.print("Código do produto comprado: ");
		int codigo = sc.nextInt();
		System.out.print("Quantidade comprada: ");
		int quantComprada = sc.nextInt();
		
		if(codigo == 1 ) {
			valorProduto = 5.00;
			valorTotal = valorProduto * quantComprada;
			System.out.printf("Valor a pagar: %.2f", valorTotal);
		}else if (codigo == 2 ) {
			valorProduto = 10.00;
			valorTotal = valorProduto * quantComprada;
			System.out.printf("Valor a pagar: %.2f ", valorTotal);
		}else if (codigo ==3) {
			valorProduto = 15.00;
			valorTotal = valorProduto * quantComprada;
			System.out.printf("Valor a pagar: %.2f ", valorTotal);
		}
		
		sc.close();

	}

}
