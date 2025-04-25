import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha sua função:");
        System.out.println("1 - Gerente");
        System.out.println("2 - Vendedor");
        System.out.println("3 - Atendente");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        Funcionarios funcionario = null;

        // Solicita os dados do usuário
        System.out.println("Informe seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Informe seu email:");
        String email = scanner.nextLine();

        System.out.println("Informe sua senha:");
        String senha = scanner.nextLine();

        // Cria o objeto de acordo com a opção escolhida
        switch (opcao) {
            case 1:
                funcionario = new Gerente(nome, email, senha);
                break;
            case 2:
                funcionario = new Vendedor(nome, email, senha);
                break;
            case 3:
                funcionario = new Atendente(nome, email, senha);
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        // Exibe o menu de ações baseado na função escolhida
        System.out.println("\nMenu de opções:");
        if (funcionario instanceof Gerente) {
            System.out.println("1 - Gerar relatório financeiro");
            System.out.println("2 - Consultar vendas");
            System.out.println("3 - Alterar dados");
            System.out.println("4 - Alterar senha");
        } else if (funcionario instanceof Vendedor) {
            System.out.println("1 - Realizar venda");
            System.out.println("2 - Consultar vendas");
            System.out.println("3 - Alterar dados");
            System.out.println("4 - Alterar senha");
        } else if (funcionario instanceof Atendente) {
            System.out.println("1 - Receber pagamentos");
            System.out.println("2 - Fechar caixa");
            System.out.println("3 - Alterar dados");
            System.out.println("4 - Alterar senha");
        }

        int acao = scanner.nextInt();
        scanner.nextLine();

        switch (acao) {
            case 1:
                if (funcionario instanceof Gerente) {
                    ((Gerente) funcionario).gerarRelatorioFinanceiro();
                } else if (funcionario instanceof Vendedor) {
                    ((Vendedor) funcionario).realizarVenda();
                } else if (funcionario instanceof Atendente) {
                    System.out.println("Informe o valor do pagamento:");
                    double valorPagamento = scanner.nextDouble();
                    ((Atendente) funcionario).receberPagamentos(valorPagamento);
                }
                break;
            case 2:
                if (funcionario instanceof Gerente) {
                    ((Gerente) funcionario).consultarVendas();
                } else if (funcionario instanceof Vendedor) {
                    ((Vendedor) funcionario).consultarVendas();
                } else if (funcionario instanceof Atendente) {
                    ((Atendente) funcionario).fecharCaixa();
                }
                break;
            case 3:
                System.out.println("Informe os novos dados:");
                System.out.println("Novo nome:");
                String novoNome = scanner.nextLine();
                System.out.println("Novo email:");
                String novoEmail = scanner.nextLine();
                funcionario.alterarDados(novoNome, novoEmail);
                break;
            case 4:
                System.out.println("Informe a nova senha:");
                String novaSenha = scanner.nextLine();
                funcionario.alterarSenha(novaSenha);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        // Exibe a conclusão do que foi feito
        System.out.println("\nAção concluída com sucesso!");
        scanner.close();
    }
}
