package exercicio10;

import exercicio10.model.Carro;

import java.util.Scanner;

public class Execicio10 {
    public final static Scanner scan = new Scanner(System.in);
    public final static Carro carro = new Carro(); 

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
                case 1-> viewParaLigarCarro();
                case 2 -> viewParaDesligarCarro();
                case 3 -> viewParaAcelerarCarro();
                case 4 -> viewParaDesacelerarCarro();
                case 5 -> {}
                case 6 -> {
                    var estadoDoCarro = carro.isLigado() ? "ligado" : "desligado";
                    var capacidadeDeReduzirMachar = carro.isVelocidadeMinimaPermitida() ? "Possível!" : "Se desejar, precisa reduzir velocidade";
                    var capacidadeDePassarMachar = carro.isVelocidadeMaximaPermitida() ? "Possível!" : "Se desejar, precisa aumentar velocidade";
                    System.out.printf("Sua velocidade é de %d, o carro está %s e está na %d marcha \n",carro.getVelocidade(), estadoDoCarro, carro.getMarcha());
                    System.out.println("Capacidade de reduzir marcha: "+capacidadeDeReduzirMachar);
                    System.out.println("Capacidade de passar marcha: "+capacidadeDePassarMachar);
                }
                case 7 -> viewParaTrocarMarcha();
                case 8 -> {
                    continuarNoMenu = false;
                    System.out.println("Obrigado, esperamos que tenha tido uma ótima experiência!");
                    }
                default -> System.out.println("Não foi possível identifica a ação que deseja realizar, por favor insira um número válido!");
            }
        }
    }

    private static void viewParaDesacelerarCarro(){
        if(carro.isLigado()) {
            if(carro.getVelocidade()>0){
                System.out.println("Vamos desacelerar um pouquinho");
                if (!carro.isVelocidadeMinimaPermitida()) {
                    System.out.println("humm..");
                    carro.desacelerarCarro();
                    System.out.printf("Velocidade atual: %s, Marcha atual: %d \n", carro.getVelocidade(), carro.getMarcha());
                } else System.out.println("Você está na velocidade mínima da marcha, precisa reduzir para desacelerar ");
            } else System.out.println("Você já está na velocidade mínima possível");
        } else System.out.println("O carro deve estar ligado para reduzir a velocidade!");
    }

    private static void viewParaAcelerarCarro(){
        if(carro.isLigado()){
            if(carro.getVelocidade()<120){
                System.out.println("Vamos acelerar um pouquinho");
                if(!carro.isVelocidadeMaximaPermitida()) {
                    System.out.println("Zummmm..");
                    carro.acelerarCarro();
                    System.out.printf("Velocidade atual: %s, Marcha atual: %d \n", carro.getVelocidade(), carro.getMarcha());
                } else System.out.println("É preciso passar marcha, você está na velocidade limite da marcha do seu carro..");
            } else System.out.println("Você já está na velocidade máxima possível, o que você pode fazer agora é reduzir.");
        }  else System.out.println("O carro deve estar ligado para acelerar o carro!");

    }

    private static void viewParaPassarMarcha(){
        if(carro.passarMarcha()){
            System.out.print("Zuuumm... ");
            System.out.println("Marcha passada! Aceleraa!");
        } else {
            System.out.println("Não é mais possível passar marcha, você está na marcha "+carro.getMarcha()+" e sua velocidade ainda é "+carro.getVelocidade());
            if(!carro.isVelocidadeMaximaPermitida()){
                System.out.println("Você precisa acelerar mais para passar de marcha");
            } else System.out.println("Você está na marcha e velocidade máxima do seu carro! O que você pode fazer é reduzir a marcha e desacelerar.");
        }
    }

    private static void viewParaReduzirMarcha(){
        if(carro.reduzirMarcha()){
            System.out.print("Unhmm... ");
            System.out.println("Marcha reduzida!");
        } else {
            System.out.println("Não é mais possível reduzir marcha, você está na marcha "+carro.getMarcha()+" e sua velocidade é "+carro.getVelocidade());
            if(!carro.isVelocidadeMinimaPermitida()){
                System.out.println("Você precisa diminuir sua velocidade para reduzir a marcha");
            } else System.out.println("Você está na marcha e velocidade mínima do seu carro! O que você pode fazer é passar marcha e acelerar.");
        }
    }
    private static void viewParaTrocarMarcha() {
        if(carro.isLigado()){
            System.out.println("Vamos trocar de marcha. Você deseja passar marcha ou reduzir?");
            System.out.println("1 - Passar marcha");
            System.out.println("2 - Reduzir marcha");
            int acaoDaMarcha = scan.nextInt();
            switch (acaoDaMarcha){
                case 1-> viewParaPassarMarcha();
                case 2-> viewParaReduzirMarcha();
                default -> System.out.println("Não foi possível identificar se deseja reduzir ou passar marcha. Tente realizar a ação novamente!");
            }
        } else System.out.println("O carro deve estar ligado para passar marcha ou reduzir!");
    }

    private static void viewParaLigarCarro() {
        if(!carro.isLigado() && carro.getMarcha()==0 && carro.getVelocidade()==0){
            System.out.println("Ligando carro..");
            System.out.print("rumDunDunDun...  ");
            carro.setLigado(true);
            System.out.println("Carro ligado!");
        } else System.out.println("Carro já está ligado!");
    }

    private static void viewParaDesligarCarro() {
        if(carro.isLigado()){
           if( carro.getMarcha()==0 && carro.getVelocidade()==0) {
               System.out.println("Desligando carro..");
               System.out.print("brunff...  ");
               carro.setLigado(false);
               System.out.println("Carro desligado!");
           } else System.out.println("Carro em movimento.. Não é possível desligar, você precisa reduzir a velocidade e a marcha para 0");
        } else System.out.println("Carro já está desligado!");
    }
}
