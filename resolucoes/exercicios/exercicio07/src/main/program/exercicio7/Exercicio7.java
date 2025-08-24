package exercicio7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio7 {

    public static int primeiroNumero;
    public static int segundoNumero;

    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        System.out.println("Vamos ver o intervalo de números inteiros ímpares ou pares entre dois números?");

        primeiroNumero = receberNumero(scan);
        segundoNumero = receberNumero(scan);

        if(primeiroNumero >= segundoNumero){
            throw new RuntimeException("O segundo número deve ser maior que o primeiro");
        }

        char tipoDeIntervalo;
        System.out.println("Você quer saber o intervalo de números ímpares ou pares?");
        System.out.print("Insira 'I' para Ímpares e 'P' para Pares \n");
        tipoDeIntervalo = scan.next().charAt(0);

        switch (Character.toLowerCase(tipoDeIntervalo)){
            case 'i':
                for(int i = segundoNumero; i >= primeiroNumero; i--) {
                    if (i % 2 != 0) {
                        System.out.printf("%d ", i);
                    }
                }
                break;
            case 'p':
                for(int i = segundoNumero; i >= primeiroNumero; i--){
                    if (i % 2 ==0){
                        System.out.printf("%d ", i);
                    }
                }
                break;
            default:
                System.out.println("Não foi possível identificar o que você deseja. Insira 'P' para intervalo de números pares e 'I' para intervalo de números ímpares.");
                break;
        }
    }

    public static int receberNumero(Scanner scan){
        System.out.println("Insira o número inteiro");
        try {
           return scan.nextInt();
        } catch (InputMismatchException ex){
            throw new InputMismatchException("Deve ser inserido um número inteiro");
        }
    }
}
