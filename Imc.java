package prjListaSeSenao;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, k, i;
		
		System.out.println("Digite sua altura: ");
		a = in.nextDouble();
		System.out.println("Digite seu peso: ");
		k = in.nextDouble();
		i = k/(a*a);
		System.out.println("Seu IMC é de "+i);
		if(i<18.5){
			System.out.println("Excesso de magreza");
		}
		else if(i<25) {
			System.out.println("Estado normal");
		}
		else if(i<30) {
			System.out.println("Excesso de peso");
		}
		else if(i<35) {
			System.out.println("Nível de obesidade 1");
		}
		else if(i<40) {
			System.out.println("Nível de obesidade 2");
		}
		else {
			System.out.println("Nível de obesidade 3");
		}
	}

}
