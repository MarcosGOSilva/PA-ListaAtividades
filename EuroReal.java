import java.util.Scanner;
public class EuroReal {
	public static void main(String[] args) {
		double euro, real, cotacao;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor em euros: ");
		euro = leia.nextDouble();
		System.out.println("Digite a cotação do euro: ");
		cotacao = leia.nextDouble();
		real = euro * cotacao;
		System.out.println("O valor de " + euro + ", é igual a " + real + " real/s");
		leia.close();
	}

}
