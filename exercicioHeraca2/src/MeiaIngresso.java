import java.util.Scanner;

public non-sealed class MeiaIngresso extends Ingresso {

    public MeiaIngresso(double valor, String nome, boolean legendado){
        super(valor, nome, legendado);
    }

    @Override
    public double getValorReal(){
        return valor / 2;
    }

    // Método que cria o ingresso e coleta as informações
    public static Ingresso criarIngresso(Scanner scanner, double valorBase) {
        System.out.print("Nome do filme: ");
        String nomeFilme = scanner.nextLine();
        System.out.print("Legendado (true/false): ");
        boolean legendado = scanner.nextBoolean();
        scanner.nextLine();

        return new MeiaIngresso(valorBase, nomeFilme, legendado);
    }
}
