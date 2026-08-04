package prjCadeado;

import java.util.Scanner;

public class PrjCadeado {

	public static void main(String[] args) {
		int idade, anoAtual, anoNasc;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite sua ano de nascimento: ");
		anoNasc = in.nextInt ();
		System.out.println("Digite o ano atual: ");
		anoAtual = in.nextInt ();
		idade = anoAtual - anoNasc;
		System.out.println("A sua idade é: "+ idade);
		if(idade<10) {
			System.out.println("Criança");
		}
		else if(idade<18) {
			System.out.println("Adolecente");
		}
		else if(idade<60) {
			System.out.println("Adulto");
		}
		else {
			System.out.println("Idoso");
		}
	}

}
