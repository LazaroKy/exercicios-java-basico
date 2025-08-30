package exercicio9;

import exercicio9.model.Conta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio9 {
    public static final Scanner scan = new Scanner(System.in);;
    public static Conta conta = null;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Olá, bem vindo ao Banco Confiança - Lugar onde seu dinherio está seguro.");
        System.out.println("Crie já a sua conta!");

        boolean continuarNoMenu = true;
        while(continuarNoMenu){
            Thread.sleep(400);
        System.out.println(
                """
                
                Insira o número de acordo com o serviço que desejar:
                -----------------------------------------------------
                1 - Criar Conta
                2 - Consultar saldo
                3 - Consultar cheque especial
                4 - Depositar dinheiro;
                5 - Sacar dinheiro;
                6 - Pagar um boleto.
                7 - Verificar se a conta está usando cheque especial.
                8 - Exit
                -----------------------------------------------------"""
        );
         switch (scan.nextInt()){
             case 1 -> viewDeCriarConta();
             case 2 -> {}
             case 3 -> viewDeRealizarDeposito();
             case 4 -> {}
             case 5 -> {}
             case 6 -> {}
             case 7 -> {}
             case 8 ->  {
                 continuarNoMenu = false;
                 System.out.println("Obrigado, esperamos que tenha tido uma ótima experiência!");
             }
             default -> System.out.println("Entrada não esperada, por favor, insira um número válido de acordo com os serviços.");
         }
        }//Posteriormente criar Usuário, assim o usuário tem a conta e tal
    }

    public static void viewDeCriarConta(){
        if(conta == null){
            double valorDepositoInicial =0;
            System.out.println("Crie agora mesmo uma conta realizando um depósito inicial");
            while(valorDepositoInicial == 0) {
                System.out.println("Informe o valor do depósito inicial: ");
                try {
                    valorDepositoInicial = scan.nextDouble();
                    if (valorDepositoInicial <= 0) throw new IllegalArgumentException();
                    conta = new Conta(valorDepositoInicial);
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida, digite apenas números e use . para representar as casas decimais");
                    scan.nextLine(); //
                } catch (IllegalArgumentException e) {
                    System.out.println("Deve ser inserido um valor númerico maior que 0");
                }
            }
            System.out.println("Conta criada com sucesso!");
        } else{
            System.out.println("Você já possui uma conta cadastrada");
        }
    }

    public static void viewDeRealizarDeposito() {
        if(conta != null){
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
        } else {
            System.out.println("Não é possível realizar deposito! Antes você deve criar uma conta.");

        }
    }
}
