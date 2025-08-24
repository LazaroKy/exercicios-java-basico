package exercicio4;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio4 {
    public static void main (String[] args){
        System.out.println("Vamos conferir a diferença de idade entre duas pessoas?");
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome da primera pessoa:");
        String nomePrimeiraPessoa = scan.nextLine();
        System.out.printf("Informe em que ano %s nasceu: \n", nomePrimeiraPessoa);
        int anoNascimentoPrimeiraPessoa = scan.nextInt();

        System.out.println("Agora informe o nome da segunda pessoa");
        scan.nextLine();
        String nomeSegundaPessoa = scan.nextLine();

        System.out.printf("Informe em que ano %s nasceu: \n", nomeSegundaPessoa);
        int anoNascimentoSegundaPessoa = scan.nextInt();

        int anoAtual = LocalDate.now().getYear();
        int idadePessoaUm = anoAtual -  anoNascimentoPrimeiraPessoa;
        int idadePessoaDois =  anoAtual - anoNascimentoSegundaPessoa;

        int diferencaDeIdade = idadePessoaUm - idadePessoaDois;

        System.out.printf("%s tem %d anos e %s tem %d anos. Assim, a %s tem %d  anos que %s. \n",
                nomePrimeiraPessoa, idadePessoaUm, nomeSegundaPessoa, idadePessoaDois, nomePrimeiraPessoa,diferencaDeIdade, nomeSegundaPessoa );

    }
}
