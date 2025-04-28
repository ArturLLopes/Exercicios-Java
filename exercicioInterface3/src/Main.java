import Marketing.*;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;

        do {
            System.out.println("\nEscolha o serviço para enviar a mensagem:");
            System.out.println("1 - SMS");
            System.out.println("2 - E-mail");
            System.out.println("3 - Redes Sociais");
            System.out.println("4 - WhatsApp");
            System.out.println("5 - Sair");
            option = scanner.nextInt();
            scanner.nextLine(); // consumir o \n que sobrou

            if (option >= 1 && option <= 4) {
                System.out.println("Digite a mensagem a ser enviada:");
                String mensagem = scanner.nextLine();

                MensagemMarketing serviço = null;

                switch (option) {
                    case 1 -> serviço = new Sms();
                    case 2 -> serviço = new Email();
                    case 3 -> serviço = new RedeSocial();
                    case 4 -> serviço = new WhatsApp();
                }

                if (serviço != null) {
                    serviço.enviarMensagem(mensagem);
                }
            } else if (option == 5) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida!");
            }

        } while (option != 5);
    }
}
