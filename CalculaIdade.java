package prjDecisaoTomada;
import java.util.Scanner;
public class CalculaIdade {

	public static void main(String[] args) {
		float dnasc, datual, idade;
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite o ano atual:");
		datual = ler.nextFloat();
		System.out.println("Digite seu ano de nascimento:");
		dnasc = ler.nextFloat();
		idade = datual - dnasc;
		System.out.println("Sua idade é: " + idade);
		if(idade<18) {
			System.out.println("Menor de idade");
		}
		else {
			System.out.println("Maior de idade");
		}
		ler.close();
 	}

}
