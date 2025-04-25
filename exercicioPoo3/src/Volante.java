public class Volante {
    public void virarEsquerda(int velocidade) {
        if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando para a esquerda.");
        } else {
            System.out.println("Não é possível virar com a velocidade atual.");
        }
    }

    public void virarDireita(int velocidade) {
        if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando para a direita.");
        } else {
            System.out.println("Não é possível virar com a velocidade atual.");
        }
    }
}
