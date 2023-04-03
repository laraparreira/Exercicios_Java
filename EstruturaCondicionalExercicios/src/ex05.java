import java.util.Locale;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Preço unitário do produto: ");
		float precoUnitario = sc.nextFloat();
		System.out.print("Quantidade comprada: ");
		int quant = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		float dinheiro = sc.nextFloat();
		
		float valorCompra = precoUnitario * quant;
		float troco = dinheiro - valorCompra;
		
		
		if (valorCompra > dinheiro) {
			float dinNegativo = valorCompra - dinheiro;
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f ",dinNegativo);
		}else {
			System.out.printf("Troco :%.2f ", troco);
		}
		sc.close();

	}

}
