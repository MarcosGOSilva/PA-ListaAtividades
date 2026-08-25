package prjWhileTeams;

import java.util.Scanner;

public class FaixaEtaria {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pessoas = 10;
        int idade;
        int faixa1 = 0;
        int faixa2 = 0;
        int faixa3 = 0;
        int faixa4 = 0;
        int faixa5 = 0;

        for (int i = 1; i <= pessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            idade = in.nextInt();

            if (idade <= 15) {
                faixa1++;
            } else if (idade <= 30) {
                faixa2++;
            } else if (idade <= 45) {
                faixa3++;
            } else if (idade <= 60) {
                faixa4++;
            } else {
                faixa5++;
            }
        }

        System.out.println("\nQuantidade de pessoas:");
        System.out.println("Até 15 anos: " + faixa1);
        System.out.println("16 a 30 anos: " + faixa2);
        System.out.println("31 a 45 anos: " + faixa3);
        System.out.println("46 a 60 anos: " + faixa4);
        System.out.println("61 anos ou mais: " + faixa5);

        System.out.println("\nPorcentagem:");
        System.out.println("Até 15 anos: " + (faixa1 * 100.0 / pessoas) + "%");
        System.out.println("16 a 30 anos: " + (faixa2 * 100.0 / pessoas) + "%");
        System.out.println("31 a 45 anos: " + (faixa3 * 100.0 / pessoas) + "%");
        System.out.println("46 a 60 anos: " + (faixa4 * 100.0 / pessoas) + "%");
        System.out.println("61 anos ou mais: " + (faixa5 * 100.0 / pessoas) + "%");

        in.close();
    }
}