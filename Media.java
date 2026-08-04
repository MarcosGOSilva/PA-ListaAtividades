package prjListaSeSenao;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n1, n2, m, n3, mf;
		
		System.out.println("Digite a primeira nota: ");
		n1 = in.nextDouble();
		System.out.println("Digite a primeira nota: ");
		n2 = in.nextDouble();
		m = (n1 + n2)/2;
		if (m < 3) {
            System.out.println("Média: " + m);
            System.out.println("Aluno REPROVADO.");
        } 
		else if (m >= 6) {
            System.out.println("Média: " + m);
            System.out.println("Aluno APROVADO.");
        } 
		else {
            System.out.println("Média: " + m);
            System.out.println("Aluno em EXAME.");
            System.out.print("Digite a nota do exame: ");
            n3 = in.nextDouble();
            mf = (m + n3) / 2;
            System.out.println("Nova média: " + mf);
       if (mf >= 6) {
    	   System.out.println("Aluno APROVADO.");
       } 
       else {
    	   System.out.println("Aluno REPROVADO.");
       }
	}
}
}