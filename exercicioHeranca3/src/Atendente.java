public non-sealed class Atendente extends Funcionarios {

    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false); // Atendente não é administrador
        this.valorEmCaixa = 0.0;
    }

    @Override
    public void realizarLogin() {
        System.out.println(nome + " realizou login como Atendente.");
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

    public void receberPagamentos(double valor) {
        valorEmCaixa += valor;
        System.out.println("Pagamento recebido: " + valor + ". Valor em caixa: " + valorEmCaixa);
    }

    public void fecharCaixa() {
        System.out.println("Fechando o caixa. Total em caixa: " + valorEmCaixa);
    }
}
