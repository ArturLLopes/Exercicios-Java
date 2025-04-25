import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        Motor motor = new Motor();
        Aceleracao aceleracao = new Aceleracao();
        Volante volante = new Volante();
        Marchas marcha = new Marchas();

        int option = -1;

        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Virar para esquerda");
            System.out.println("6 - Virar para direita");
            System.out.println("7 - Verificar velocidade");
            System.out.println("8 - Subir a marcha");
            System.out.println("9 - Diminuir a marcha");
            System.out.println("0 - Sair");

            option = scanner.nextInt();

            switch (option) {
                case 1 -> motor.ligar();
                case 2 -> motor.desligar(aceleracao, marcha);
                case 3 -> {
                    if (motor.isLigado()) aceleracao.acelerar(marcha);
                    else System.out.println("O carro está desligado.");
                }
                case 4 -> {
                    if (motor.isLigado()) aceleracao.desacelerar(marcha);
                    else System.out.println("O carro está desligado.");
                }
                case 5 -> {
                    if (motor.isLigado()) volante.virarEsquerda(aceleracao.getVelocidade());
                    else System.out.println("O carro está desligado.");
                }
                case 6 -> {
                    if (motor.isLigado()) volante.virarDireita(aceleracao.getVelocidade());
                    else System.out.println("O carro está desligado.");
                }
                case 7 -> System.out.println("Velocidade atual: " + aceleracao.getVelocidade() + " km/h");
                case 8 -> {
                    if (motor.isLigado()) marcha.subirMarcha();
                    else System.out.println("O carro está desligado.");
                }
                case 9 -> {
                    if (motor.isLigado()) marcha.descerMarcha();
                    else System.out.println("O carro está desligado.");
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }

        } while (true);
    }
}
