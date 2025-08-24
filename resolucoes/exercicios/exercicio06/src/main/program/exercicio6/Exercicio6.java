package exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.printf("Vamos calcular seu IMC, precisamos saber seu peso e altura \n");
        System.out.printf("Informe seu peso: \n");
        double peso = scan.nextDouble();

        System.out.printf("Informe sua altura: \n");
        double altura = scan.nextDouble();

        calcularIMC(peso, altura);
    }

    public static void calcularIMC(double peso, double altura){
        double valorIMC = peso / (altura * altura);

        if(valorIMC <= 18.5){
            System.out.print("Abaixo do peso");
        } else if(valorIMC >= 18.6 && valorIMC <= 24.9){
            System.out.print("Peso ideal");
        } else if (valorIMC >=25 && valorIMC <= 29.9) {
            System.out.print("Levemente acima do peso");
        } else if(valorIMC >= 30 && valorIMC <=34.9){
            System.out.print("Obesidade Grau I");
        } else if(valorIMC >= 35 && valorIMC <= 39.9){
            System.out.print("Obesidade Grau II (Severa)");
        } else {
            System.out.print("Obesidade III (Mórbida) - Chama ajuda");
        }
        System.out.printf(" - seu IMC é %.2f", valorIMC);
    }
}
