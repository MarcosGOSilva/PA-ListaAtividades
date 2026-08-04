package prjFormulario;

import java.util.Scanner;

public class precoImposto {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        double preco, imposto;

        System.out.print("Digite o preço do produto: ");
        preco = in.nextDouble();
        if (preco <= 1000) {
            imposto = preco * 6/100;
        } else if (preco <= 2000) {
            imposto = preco * 8/100;
        } else if (preco <= 3000) {
            imposto = preco * 10/100;
        } else {
            imposto = preco * 16/100;
        }
        System.out.println("Imposto: R$ " + imposto);
    }

}
