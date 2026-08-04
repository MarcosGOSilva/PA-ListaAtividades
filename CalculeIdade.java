import java.util.Scanner;
public class CalculeIdade {
	public static void main(String[] args) {
		int anoAtual, anoNasc, idade;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o ano atual: ");
		anoAtual = leia.nextInt();
		System.out.println("Digite seu ano de nascimento: ");
		anoNasc = leia.nextInt();
		idade = anoAtual - anoNasc;
		System.out.println("Sua idade é " + idade);
		leia.close();
	}
}
