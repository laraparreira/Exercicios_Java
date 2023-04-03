import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hora inicial : ");
		int horaInicial = sc.nextInt();
		System.out.println("Hora final: ");
		int horaFinal = sc.nextInt();
		
		int duracaoTotal;
		if (horaInicial >= 12) {
			duracaoTotal = ((24 - horaInicial) + horaFinal);
			System.out.println("O jogo durou: " + duracaoTotal + " horas");
		}else if (horaInicial < 12 && horaInicial != 0) {
			duracaoTotal = ((0 - horaInicial)+ horaFinal);
			System.out.print("O jogo durou: " + duracaoTotal + " horas");
		}else if (horaInicial == 0 && horaFinal !=0) {
			duracaoTotal = horaInicial + horaFinal;
			System.out.println("O jogo durou: " + duracaoTotal + " horas");
		}else if (horaInicial == 0 && horaFinal == 0) {
			System.out.println("O jogo durou 24 horas");
		}
		sc.close();

	}

}
