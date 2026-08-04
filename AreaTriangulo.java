import java.util.Scanner;
public class AreaTriangulo {
    public static void main(String[] args) {
        double base, altura, area;
        
        Scanner leia = new Scanner(System.in); 
        System.out.println("Digite a base do triângulo: ");
        base = leia.nextDouble();
        System.out.println("Digite a altura do triângulo: ");
        altura = leia.nextDouble();
        area = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + area);
        leia.close();
    }
}