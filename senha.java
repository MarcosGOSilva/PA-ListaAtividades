package prjFormulario;

import java.util.Scanner;

public class senha {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String senha;

        System.out.print("Digite a senha: ");
        senha = in.nextLine();
        if (senha.equals("abcd1234")) {
            System.out.println("Senha correta.");
        } else {
            System.out.println("Senha incorreta.");
        }
	}

}
