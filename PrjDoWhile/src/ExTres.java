import java.util.Scanner;

public class ExTres {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int aa, an, id;
		String r;

		do {
			System.out.println("Digite o ano atual: ");
			aa = in.nextInt();
			System.out.println("Digite o seu ano de nascimento: ");
			an = in.nextInt();
			id = aa - an;
			
			if (id < 18) {
				System.out.println("você tem " + id + " anos, então você é menor de idade");
			} else {
				System.out.println("você tem " + id + " anos, então você é maior de idade");
			}
			
			System.out.println("Deseja continuar? S para Sim ou N para Não");
			r = in.next();
		} while (r.equalsIgnoreCase("S"));
		in.close();
	}

}
