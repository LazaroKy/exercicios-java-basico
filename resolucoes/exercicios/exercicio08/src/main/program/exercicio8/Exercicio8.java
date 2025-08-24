package exercicio8;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vamos verificar se um número é dívisível por um divisor?");
        System.out.println("Insira o número que será o divisor: ");
        int divisor = scan.nextInt();

      //  boolean procurandoNumeroDivisivel = true;
        System.out.println("Vamos procurar um número divisível por "+divisor);
        while(true){
            System.out.println("Insira um número: ");
            int numero = scan.nextInt();
            if (numero< divisor) {
                System.out.println("O número deve ser maior que "+divisor);
                continue;
            }
            if (numero % divisor != 0){
                System.out.println(numero+" não é divisível por "+divisor);
               //procurandoNumeroDivisivel = true;
                break;
            }
        }

    }
}
