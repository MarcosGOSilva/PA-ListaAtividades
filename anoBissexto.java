package prjFormulario;

import java.util.Scanner;

public class anoBissexto {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	     int ano;

	     System.out.print("Digite um ano: ");
	     ano = in.nextInt();
	     if (ano % 4 == 0) {
	    	 System.out.println("Ano bissexto.");
	     } 
	     else 
	     {
	    	 System.out.println("Ano não é bissexto.");
	     }
	}

}
