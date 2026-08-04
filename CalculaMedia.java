package prjLista2;
import java.util.Scanner;

public class CalculaMedia {
	public static void main(String[] args ) {
		double n1, n2, media;
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com 1a nota do aluno:");
		n1 =leia.nextDouble();
		System.out.println("Entre com 2a nota do aluno:");
		n2 = leia.nextDouble();
		media = (n1+n2)/2;
		System.out.println("Sua média é "+media);
		leia.close();
	}
}
