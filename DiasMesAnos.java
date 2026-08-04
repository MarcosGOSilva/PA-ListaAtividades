import java.util.Scanner;
public class DiasMesAnos {
	public static void main(String[] args) {
		int dia, mes, ano;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite os dias a serem convertidos: ");
		dia = leia.nextInt();
		mes = dia / 30;
		ano = dia / 365;
		System.out.println("O resultado dos dias convertidos são " + ano + " ano/s " + "ou " + mes + " meses");
		leia.close();
	}
}
