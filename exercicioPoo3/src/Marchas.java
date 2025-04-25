public class Marchas {
    private int marchaAtual;

    public Marchas() {
        this.marchaAtual = 0;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void subirMarcha() {
        if (marchaAtual < 6) {
            marchaAtual++;
            System.out.println("Subindo marcha. Marcha atual: " + marchaAtual);
        } else {
            System.out.println("Já está na marcha máxima.");
        }
    }

    public void descerMarcha() {
        if (marchaAtual > 0) {
            marchaAtual--;
            System.out.println("Descendo marcha. Marcha atual: " + marchaAtual);
        } else {
            System.out.println("Já está em ponto morto.");
        }
    }

    public boolean velocidadePermitida(int velocidade) {
        return switch (marchaAtual) {
            case 0 -> velocidade == 0;
            case 1 -> velocidade >= 0 && velocidade <= 20;
            case 2 -> velocidade >= 21 && velocidade <= 40;
            case 3 -> velocidade >= 41 && velocidade <= 60;
            case 4 -> velocidade >= 61 && velocidade <= 80;
            case 5 -> velocidade >= 81 && velocidade <= 100;
            case 6 -> velocidade >= 101 && velocidade <= 120;
            default -> false;
        };
    }
}
