package prjWhileTeams;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.print("Digite a quantidade de termos: ");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(primeiro + " ");

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        in.close();
    }
}