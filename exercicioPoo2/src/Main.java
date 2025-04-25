import java.util.Scanner;

public class Main {


    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        var option = -1;

        System.out.print("Informe o valor inicial da conta: ");
        int valorInicial = scanner.nextInt();

        ContaBancaria conta = new ContaBancaria(valorInicial);

        do{
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto");
            System.out.println("6 - Verificar se a conta está usando cheque especial");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("Saldo atual: R$ " + conta.getSaldo());
                }
                case 2 -> {
                    System.out.println("Limite do cheque especial: R$ " + conta.getLimiteChequeEspecial());
                    System.out.println("Saldo disponível total (saldo + cheque especial): R$ " + conta.getSaldoDisponivel());
                }
                case 3 -> {
                    System.out.print("Digite o valor para depósito: R$ ");
                    int valor = scanner.nextInt();
                    conta.depositar(valor);
                    System.out.println("Depósito realizado com sucesso!");
                }
                case 4 -> {
                    System.out.print("Digite o valor para saque: R$ ");
                    int valor = scanner.nextInt();
                    if (conta.sacar(valor)) {
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                }
                case 5 -> {
                    System.out.print("Digite o valor do boleto: R$ ");
                    int valor = scanner.nextInt();
                    if (conta.pagar(valor)) {
                        System.out.println("Pagamento realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                }
                case 6 -> {
                    if (conta.usandoChequeEspecial()) {
                        System.out.println("A conta está utilizando o cheque especial.");
                    } else {
                        System.out.println("A conta NÃO está utilizando o cheque especial.");
                    }
                }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (option != 0);

        scanner.close();
    }
}