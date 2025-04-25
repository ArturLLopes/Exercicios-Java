import java.util.Scanner;

public non-sealed class FamiliaIngresso extends Ingresso {

    private int numeroPessoas;

    public FamiliaIngresso(double valor, String nome, boolean legendado, int numeroPessoas){
        super(valor, nome, legendado);
        this.numeroPessoas = numeroPessoas;
    }

    @Override
    public double getValorReal(){
        double total = valor * numeroPessoas;
        if(numeroPessoas > 3){
            total *= 0.95; // 5% de desconto
        }
        return total;
    }

    @Override
    public void imprimirInfo(){
        super.imprimirInfo();
        System.out.println("Número de pessoas: " + numeroPessoas);
    }

    // Método que cria o ingresso e coleta as informações
    public static Ingresso criarIngresso(Scanner scanner, double valorBase) {
        System.out.print("Nome do filme: ");
        String nomeFilme = scanner.nextLine();
        System.out.print("Legendado (true/false): ");
        boolean legendado = scanner.nextBoolean();
        System.out.print("Número de pessoas: ");
        int numPessoas = scanner.nextInt();
        scanner.nextLine();

        return new FamiliaIngresso(valorBase, nomeFilme, legendado, numPessoas);
    }
}
