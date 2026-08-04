import java.util.Scanner;
public class SomaQuadrados {
	public static void main(String[] args) {
		double v1, v2, v3, soma;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		v1 = leia.nextDouble();
		System.out.println("Digite o segundo valor: ");
		v2 = leia.nextDouble();
		System.out.println("Digite o terceiro valor: ");
		v3 = leia.nextDouble();
		soma = v1 * v1 + v2 * v2 + v3 * v3;
		System.out.println("O resultado é: " + soma);
		leia.close();
	}
}
