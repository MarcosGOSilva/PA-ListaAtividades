package prjWhileTeams;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero;
        long fatorial = 1;

        System.out.print("Digite um número: ");
        numero = in.nextInt();

        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }

        System.out.println("Fatorial de " + numero + " = " + fatorial);

        in.close();
    }
}