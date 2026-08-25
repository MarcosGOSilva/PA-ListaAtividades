package prjWhileTeams;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int base;
        int expoente;
        int resultado = 1;

        System.out.print("Digite a base: ");
        base = in.nextInt();

        System.out.print("Digite o expoente: ");
        expoente = in.nextInt();

        for (int i = 1; i <= expoente; i++) {
            resultado = resultado * base;
        }

        System.out.println("Resultado: " + resultado);

        in.close();
    }
}