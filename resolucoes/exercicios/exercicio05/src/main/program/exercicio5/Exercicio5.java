package exercicio5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Vamos descobrir a tabuada de um número de 0 a 10? \n");
        System.out.printf("Insira o número que descobriremos a tabuada: \n");
        int numero = scan.nextInt();
        System.out.printf("---------------- \n");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d \n", numero, i, numero * i);
        }
        System.out.printf("----------------");
    }
}
