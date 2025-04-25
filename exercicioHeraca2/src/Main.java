import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Valor base do ingresso
        double valorBase = 20.0;

        // Pergunta qual ingresso o usuário deseja
        System.out.println("Escolha o tipo de ingresso:");
        System.out.println("1 - Ingresso Comum");
        System.out.println("2 - Meia Entrada");
        System.out.println("3 - Ingresso Família");
        System.out.print("Digite a opção desejada (1, 2 ou 3): ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        // Determinar o tipo de ingresso com switch
        Ingresso ingresso = null;
        switch (opcao) {
            case 1:
                // Ingresso Comum
                ingresso = PadraoIngresso.criarIngresso(scanner, valorBase);
                break;

            case 2:
                // Meia Entrada
                ingresso = MeiaIngresso.criarIngresso(scanner, valorBase);
                break;

            case 3:
                // Ingresso Família
                ingresso = FamiliaIngresso.criarIngresso(scanner, valorBase);
                break;

            default:
                System.out.println("Opção inválida! Por favor, escolha 1, 2 ou 3.");
                break;
        }

        if (ingresso != null) {
            ingresso.imprimirInfo();
        }

        scanner.close();
    }
}
