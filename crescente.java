package prjListaSeSenao;

import java.util.Scanner;

public class crescente {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c;
		
		System.out.println("Digite o primeiro número: ");
		a = in.nextDouble();
		System.out.println("Digite o segundo número: ");
		b = in.nextDouble();
		System.out.println("Digite o terceiro número: ");
		c = in.nextInt();
		if(a<=b && a<=c) {
			System.out.println(a);
		}
		else if(b<=a && b<=c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
		if(a>=b && a<=c){
			System.out.println(a);
		}
		else if(a>=c && a<=b){
			System.out.println(a);
		}
		else if(b>=a && b<=c) {
			System.out.println(b);
		}
		else if(b>=c && b<=a) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
		
	}
}
