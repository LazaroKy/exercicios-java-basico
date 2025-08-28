package exercicio9;

import exercicio9.model.Conta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio9 {
    public static Scanner scan = new Scanner(System.in);;
    public static final Conta conta = new Conta();

    public static void main(String[] args) {

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
                -----------------------------------------------------"""
        );
         switch (scan.nextInt()){
             case 1 -> {}
             case 2 -> {}
             case 3 -> viewDeRealizarDeposito();
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

    public static void viewDeRealizarDeposito() {
        double valor =0;
        System.out.println(
                """
                Vamos realizar o deposito na conta!
                Informe o valor do depósito:""");
        while(valor <= 0){
            try{
                valor = scan.nextDouble();
                if (valor <= 0) throw new IllegalArgumentException();
                conta.realizarDeposito(valor);
            } catch(InputMismatchException e){
                System.out.println("Entrada inválida, digite apenas números e use . para representar as casas decimais");
                scan.nextLine(); //
            } catch(IllegalArgumentException e){
                System.out.println("Deve ser inserido um valor númerico maior que 0");
            }
        }
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("Informações sobre a conta: "+conta);
        System.out.println("-----------------------------------------------------");
    }
}
