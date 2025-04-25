public class ChequeEspecial {
    private final int limite;
    private int usado;
    private boolean cobrancaPendente;

    public ChequeEspecial(int valorInicial) {
        if (valorInicial <= 500) {
            this.limite = 50;
        } else {
            this.limite = valorInicial / 2;
        }
        this.usado = 0;
        this.cobrancaPendente = false;
    }

    public int getLimite() {
        return limite;
    }

    public int getDisponivel() {
        return limite - usado;
    }

    public boolean usar(int valor) {
        if (valor <= getDisponivel()) {
            usado += valor;
            cobrancaPendente = true;
            return true;
        }
        return false;
    }

    public int calcularTaxa() {
        return (int) (usado * 0.20);
    }

    public boolean isUsandoChequeEspecial() {
        return usado > 0;
    }

    public boolean isCobrancaPendente() {
        return cobrancaPendente;
    }

    public int totalPagarComTaxa() {
        return usado + calcularTaxa();
    }

    public void quitar() {
        usado = 0;
        cobrancaPendente = false;
    }
}
