import java.util.Scanner;

public non-sealed class PadraoIngresso extends Ingresso {
    public PadraoIngresso(double valor, String nome, boolean dublado) {
        super(valor, nome, dublado);
    }

    @Override
    public double getValorReal() {
        return valor;
    }

    public static Ingresso criarIngresso(Scanner scanner, double valorBase) {
        System.out.print("Nome do filme: ");
        String nomeFilme = scanner.nextLine();
        System.out.print("Legendado (true/false): ");
        boolean legendado = scanner.nextBoolean();
        scanner.nextLine();

        return new PadraoIngresso(valorBase, nomeFilme, legendado);
    }
}