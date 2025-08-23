package program;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US); //Sem isso, ele reconhece que meu sistema é do brasil e caso eu insira o valor utilizando ponto decimal ele lança um erro de inputMismatch
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho do lado do quadrado para calcularmos a área");
        double lado = scan.nextDouble();
        if (lado <=0) System.out.println("Não é possível ter um figura geométrica com dimensões menor ou igual 0");

        double area = lado * lado;

        System.out.printf("Área de um quadrado de lado %.2f é %.2f", lado, area);
    }
}
