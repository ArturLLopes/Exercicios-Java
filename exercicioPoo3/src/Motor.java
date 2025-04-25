public class Motor {

    private boolean ligado;


    public Motor() {
        ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("Carro já está ligado.");
        }
    }

    public void desligar(Aceleracao aceleracao, Marchas marcha) {
        if (ligado && aceleracao.getVelocidade() == 0 && marcha.getMarchaAtual() == 0) {
            ligado = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("Carro não pode ser desligado. Verifique se está em ponto morto e velocidade 0.");
        }
    }

    public boolean isLigado() {
        return ligado;
    }
}

