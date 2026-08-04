package prjListaSeSenao;

import java.util.Scanner;

public class Irpf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sal, imp;

        System.out.print("Digite o salário: R$ ");
        sal = in.nextDouble();
        if (sal <= 1434.59) {
            imp = 0;
        } 
        else if (sal <= 2150.00) {
            imp = (sal * 7.5 / 100) - 107.59;
        } 
        else if (sal <= 2866.70) {
            imp = (sal * 15 / 100) - 268.84;
        } 
        else if (sal <= 3582.00) {
            imp = (sal * 22.5 / 100) - 483.84;
        } 
        else {
            imp = (sal * 27.5 / 100) - 662.94;
        }
        if (imp < 0) {
            imp = 0;
        }
        System.out.println("Valor do IRPF: R$ " + imp);
    }
}