import java.util.Scanner;
import entities.Inquilino;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String nome, email;
        int numeroQuarto, quantidadeDesejada;
        
        Inquilino[] quartos = new Inquilino[10];

        System.out.println("Quantos quartos serão alugados? ");

        do {
            
            quantidadeDesejada = sc.nextInt();
            sc.nextLine();

            if ((quantidadeDesejada < 0) || (quantidadeDesejada > 9)) {
                System.out.println("Quantidade inválida, por favor selecione uma quantidade de 0 a 9");
            }

        } while ((quantidadeDesejada < 0) || (quantidadeDesejada > 9));


        for (int i = 0; i < quantidadeDesejada; i++) {


            System.out.printf("Vamos cadastrar os dados do %s° inquilo%n", i+1);
            System.out.print("Nome: ");
            nome = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Quarto desejado: ");

            do {
            
                numeroQuarto = sc.nextInt();
                sc.nextLine();

            if ((numeroQuarto < 0) || (numeroQuarto > 9)) {
                System.out.println("Quantidade inválida, por favor selecione uma quantidade de 0 a 9");
            } else {

            }

        } while ((numeroQuarto < 0) || (numeroQuarto > 9));


            Inquilino novoInquilino = new Inquilino(nome, email, numeroQuarto);

            quartos[numeroQuarto] = novoInquilino;

        }

        System.out.println("Quartos ocupados: ");

        for (int j = 0; j < quartos.length; j++) {

            if (quartos [j] != null) {
                System.out.println(quartos[j]);
                // System.out.println(quartos[j].novoInquilino.infoInquilino());

            }

        }

        sc.close();

    }
}
