public non-sealed class Gerente extends Funcionarios {

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true); // Gerente sempre é administrador
    }


    @Override
    public void realizarLogin() {
        System.out.println(nome + " realizou login como Gerente.");
    }

    @Override
    public void realizarLogoff() {
        System.out.println(nome + " realizou logoff.");
    }

    @Override
    public void alterarDados(String nome, String email) {
        this.nome = nome;
        this.email = email;
        System.out.println("Dados alterados com sucesso.");
    }

    @Override
    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso.");
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("Gerando relatório financeiro...");
    }

    public void consultarVendas() {
        System.out.println("Consultando vendas...");
    }

}
