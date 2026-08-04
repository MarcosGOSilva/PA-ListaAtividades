import java.util.Scanner;

public class RodizioCarro {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int np;
		
		System.out.println("Escreva o último númro da placa do carro: ");
		np = leia.nextInt();
		
		switch (np) {
		case 1:
		case 2:
			System.out.println("segunda");
			break;
		case 3:
		case 4:
			System.out.println("terça");
			break;
		case 5:
		case 6:
			System.out.println("quarta");
			break;
		case 7:
		case 8:
			System.out.println("quinta");
			break;
		default:
			System.out.println("sexta");
		}
		
		leia.close();

	}

}
