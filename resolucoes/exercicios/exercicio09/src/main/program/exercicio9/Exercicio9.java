package exercicio9;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Olá, bem vindo ao Banco Confiança - Lugar onde seu dinherio está seguro.");

        boolean continuarNoMenu = true;
        while(continuarNoMenu){
        System.out.println(
                """
                
                Insira o número de acordo com o serviço que desejar:
                -----------------------------------------------------
                1 - Consultar saldo
                2 - Consultar cheque especial
                3 - Depositar dinheiro;
                4 - Sacar dinheiro;
                5 - Pagar um boleto.
                6 - Verificar se a conta está usando cheque especial.
                7 - Exit
                -----------------------------------------------------
                """
        );
         switch (scan.nextInt()){
             case 1 -> {}
             case 2 -> {}
             case 3 -> {}
             case 4 -> {}
             case 5 -> {}
             case 6 -> {}
             case 7 ->  {
                 continuarNoMenu = false;
                 System.out.println("Obrigado, esperamos que tenha tido uma ótima experiência!");
             }
             default -> System.out.println("Entrada não esperada, por favor, insira um número válido de acordo com os serviços.");
         }
        }//Posteriormente criar Usuário, assim o usuário tem a conta e tal

    }
}
