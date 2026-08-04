import java.util.Scanner;
public class ValoresInvertidos {
	public static void main(String[] args) {
		int a, b, c;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		a = leia.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = leia.nextInt();
		c = a;
		a = b;
		b = c;
		System.out.println("Trocando os valores fica: " + a + " e " + b);
		leia.close();
	}
}