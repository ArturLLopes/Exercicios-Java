public non-sealed class Vendedor extends Funcionarios {

    public int quantidadeVendas;


    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.quantidadeVendas = 0;
    }

    @Override
    public void realizarLogin() {
        System.out.println(nome + " realizou login como Vendedor.");
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

    public void realizarVenda() {
        quantidadeVendas++;
        System.out.println("Venda realizada. Total de vendas: " + quantidadeVendas);
    }

    public void consultarVendas() {
        System.out.println("Consultando vendas. Total de vendas: " + quantidadeVendas);
    }
}
