import java.util.Scanner;
public class PintarParede {
	public static void main(String[] args) {
		double comprimento, largura, latas, soma;
		Scanner leia = new Scanner(System.in);
		
	 	System.out.println("Digite o comprimento: ");
		comprimento = leia.nextDouble();
		System.out.println("Digite a largura: ");
		largura = leia.nextDouble();
		soma = comprimento * largura;
		latas = soma / 3.8;
		System.out.println("A quantidade de latas são " + latas);
		leia.close();
	}
}
