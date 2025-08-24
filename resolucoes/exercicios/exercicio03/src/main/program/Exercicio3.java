package program;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos calcular a área de um retângulo");
        System.out.println("Informe a base do retângulo: ");
        double base = scan.nextDouble();
        System.out.println("Informe a altura do retângulo: ");
        double altura = scan.nextDouble();
        double areaRetangulo = base * altura;
        System.out.printf("Área de um retângulo com base %.2f e altura %.2f é %.2f", base, altura, areaRetangulo);
    }
}
