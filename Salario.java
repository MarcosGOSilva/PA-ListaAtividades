import java.util.Scanner;
public class Salario {
	public static void main(String[] args) {
		double salario, prct, resultado;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite seu salário: ");
		salario = leia.nextDouble();
		prct = salario / 100 * 10;
		resultado = salario + prct;
		System.out.println("O salário com mais 10% ficou: " + resultado);
		leia.close();
	}
}
