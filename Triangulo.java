package prjListaSeSenao;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c;
		
		System.out.println("Digite o valor A: ");
		a = in.nextDouble();
		System.out.println("Digite o valor B: ");
		b = in.nextDouble();
		System.out.println("Digite o valor C: ");
		c = in.nextDouble();
		if((a>b+c) || (b>a+c) || (c>a+b)) {
			System.out.println("Não é trinângulo");
		}
		else if(a==b && b==c) {
			System.out.println("É um triângulo equilátero");
		}
		else if(a !=b && b !=c && c != a) {
			System.out.println("É um triângulo escaleno");
		}
		else {
			System.out.println("É um triângulo isósceles");
		}

	}

}
