package prjListaSeSenao;

import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c, d, p, n, x;
		
		System.out.println("Digite o valor A: ");
		a = in.nextDouble();
		System.out.println("Digite o valor B: ");
		b = in.nextDouble();
		System.out.println("Digite o valor C: ");
		c = in.nextDouble();
		d = (b*b)-(4*a*c);
		System.out.println("O delta é: ");
		if(d<0) {
			System.out.println("Não exite raiz");
		}
		else if(d==0) {
			System.out.println("Existe apenas uma raiz");
		}
		else {
			System.out.println("Existe duas raizes");
		}
		p = (-b + Math.sqrt(d)/(2*a));
		n = (-b - Math.sqrt(d)/(2*a));
		System.out.println("O x1 é "+p);
		System.out.println("O x2 é "+n);
	}

}
