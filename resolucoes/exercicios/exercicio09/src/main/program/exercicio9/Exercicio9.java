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
             case 2 -> {
                 if(conta != null){
                     System.out.printf("O saldo da sua conta é: R$%.2f \n",conta.getSaldo());
                 } else {
                     System.out.println("Não é possível realizar depósito! Antes você deve criar uma conta.");
                 }
             }
             case 3 -> {
                     if (conta != null) {
                         System.out.printf("O Valor do seu cheque especial é até R$%.2f \n", conta.getChequeEspecial());
                     } else {
                         System.out.println("Não é possível realizar depósito! Antes você deve criar uma conta.");
                     }
                 }
             case 4 -> viewDeRealizarDeposito();
             case 5 -> viewSacarDinherio();
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

    private static void viewSacarDinherio() {
        if(conta == null) {
            System.out.println("Sacar dinherio - Informe quanto deseja sacar:");
            try {
                conta.sacarValor(receberValorValido());
            } catch (IllegalArgumentException error) {
                System.out.println(error.getMessage());
            }
        }else {
            System.out.println("Não é possível realizar deposito! Antes você deve criar uma conta.");
        }
    }

    public static void viewDeCriarConta(){
        if(conta == null){
            System.out.println("Crie agora mesmo uma conta realizando um depósito inicial");
           conta = new Conta(receberValorValido());
            System.out.println("Conta criada com sucesso!");
        } else{
            System.out.println("Você já possui uma conta cadastrada. Informações da conta: "+ conta);
        }
    }

    public static void viewDeRealizarDeposito() {
        if(conta != null){
            System.out.println(
                    """
                    Vamos realizar o deposito na conta!
                    Informe o valor do depósito:""");
            conta.realizarDeposito(receberValorValido());
            System.out.println("Depósito realizado com sucesso!");
            System.out.println("Informações sobre a conta: "+conta);
            System.out.println("-----------------------------------------------------");
        } else {
            System.out.println("Não é possível realizar deposito! Antes você deve criar uma conta.");
        }
    }

    public static double receberValorValido(){
        double valor = 0;
        while(valor <= 0){
            try{
                valor = scan.nextDouble();
                if (valor <= 0) throw new IllegalArgumentException();
            } catch(InputMismatchException e){
                System.out.println("Entrada inválida, digite apenas números e use . para representar as casas decimais");
                scan.nextLine(); //
            } catch(IllegalArgumentException e){
                System.out.println("Deve ser inserido um valor númerico maior que 0");
            }
        }
        return valor;
    }
}
