public class ContaBancaria {
    private int saldo;
    private final ChequeEspecial chequeEspecial;

    public ContaBancaria(int valorInicial) {
        this.saldo = valorInicial;
        this.chequeEspecial = new ChequeEspecial(valorInicial);
    }

    public int getSaldo() {
        return saldo;
    }

    public int getSaldoDisponivel() {
        return saldo + chequeEspecial.getDisponivel();
    }

    public boolean sacar(int valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            int restante = valor - saldo;
            if (chequeEspecial.usar(restante)) {
                saldo = 0;
                return true;
            }
        }
        return false;
    }

    public boolean pagar(int valor) {
        return sacar(valor);
    }

    public void depositar(int valor) {
        saldo += valor;

        if (chequeEspecial.isCobrancaPendente()) {
            int total = chequeEspecial.totalPagarComTaxa();
            if (saldo >= total) {
                saldo -= total;
                chequeEspecial.quitar();
            }
        }
    }

    public boolean usandoChequeEspecial() {
        return chequeEspecial.isUsandoChequeEspecial();
    }

    public int getLimiteChequeEspecial() {
        return chequeEspecial.getLimite();
    }
}
