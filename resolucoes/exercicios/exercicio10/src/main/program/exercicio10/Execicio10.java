package exercicio10;

import java.util.Scanner;

public class Execicio10 {
    public final static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Olá, eu sou sua assistente de bordo, estamos em um simulador de carro. Vamos iniciar nossa viagem?");

        boolean continuarNoMenu = true;
        while(continuarNoMenu) {

            System.out.println(
                    """
   
                    Insira o número de acordo com a ação que deseja realizar:
                    -----------------------------------------------------
                    1 - Ligar carro
                    2 - Desligar carro
                    3 - Acelerar
                    4 - Diminuir velocidade
                    5 - Virar para esquerda/direita
                    6 - Verificar velocidade
                    7 - Trocar a marcha
                    8 - Encerrar menu
                    -----------------------------------------------------"""
            );
            switch (scan.nextInt()) {
                case 1->{}
                case 2 -> {}
                case 3 -> {}
                case 4 -> {}
                case 5 -> {}
                case 6 -> {}
                case 7 -> {}
                case 8 -> {continuarNoMenu = false;}
                default -> System.out.println("Não foi possível identifica a ação que deseja realizar, por favor insira um número válido!");
            }
        }

    }
}
