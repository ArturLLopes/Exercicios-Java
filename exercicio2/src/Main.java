import Tributos.*;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int option;

        do {
            System.out.println("Escolha o produto para calcular o tributo");
            System.out.println("1 - Alimentacao");
            System.out.println("2 - Saude Bem Estar");
            System.out.println("3 - Vesturario");
            System.out.println("4 - Cultura");
            System.out.println("5 - Sair");
            option = scanner.nextInt();


            switch (option){
                case 1 -> Alimentacao.impostoAlimentacao(scanner);

                case 2 -> SaudeBemEstar.impostoSaudeBemEstar(scanner);

                case 3 -> Vesturario.impostoVesturario(scanner);

                case 4 -> Cultura.impostoCultura(scanner);

                case 5 -> System.out.println("Saindo...");

                default -> System.out.println("Opção inválida!");

            }
        }while (option!=5);

    }

}
