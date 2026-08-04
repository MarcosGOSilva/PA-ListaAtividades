import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int nm;
		
		System.out.println("Digite o número do mês de 1 a 12:");
		nm = leia.nextInt();
		
		switch (nm) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("O mês tem 31 dias");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("O mês tem 30 dias");
				break;
			case 2:
				System.out.println("O mês tem 28 dias");
				break;
			default:
				System.out.println("Mês inválido");
		}
		
		leia.close();
	}

}
