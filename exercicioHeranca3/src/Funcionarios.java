public sealed abstract class Funcionarios permits Gerente, Vendedor, Atendente {

    protected String nome;
    protected String email;
    protected String senha;
    protected boolean adm;

    public Funcionarios(String nome, String email, String senha, boolean adm) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.adm = adm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }

    public abstract void realizarLogin();
    public abstract void realizarLogoff();
    public abstract void alterarDados(String nome, String email);
    public abstract void alterarSenha(String novaSenha);
}
