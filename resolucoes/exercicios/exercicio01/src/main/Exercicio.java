import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Informe seu nome: \n");
        String nome = scan.nextLine();

        System.out.printf("Informe seu ano de nascimento \n");
        int anoDeNascimento = scan.nextInt();
        int anoAtual = LocalDate.now().getYear();
        int idade =  anoAtual - anoDeNascimento;
        System.out.printf("Olá "+nome+" você tem " +idade +" anos \n");
    }
}
