public class Aceleracao {
    private int velocidade;

    public Aceleracao() {
        this.velocidade = 0;
    }

    public int getVelocidade() {
        return velocidade;
    }
/*aceleração padrao 1 em 1

    public void acelerar(Marchas marcha) {
        if (marcha.getMarchaAtual() == 0) {
            System.out.println("Não é possível acelerar em ponto morto.");
            return;
        }

        if (velocidade < 120 && marcha.velocidadePermitida(velocidade + 1)) {
            velocidade++;
            System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("Velocidade máxima para a marcha atual atingida.");
        }
    }

    public void desacelerar() {
        if (velocidade > 0) {
            velocidade--;
            System.out.println("Desacelerando... Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

 */

    public void acelerar(Marchas marcha) {
        int m = marcha.getMarchaAtual();
        if (m == 0) {
            System.out.println("Não é possível acelerar em ponto morto.");
            return;
        }

        int incremento = getIncrementoPorMarcha(m);
        int novaVelocidade = velocidade + incremento;

        if (novaVelocidade > 120) {
            novaVelocidade = 120;
        }

        if (marcha.velocidadePermitida(novaVelocidade)) {
            velocidade = novaVelocidade;
            System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("Velocidade não permitida para a marcha atual.");
        }
    }

    public void desacelerar(Marchas marcha) {
        int m = marcha.getMarchaAtual();
        int decremento = getIncrementoPorMarcha(m);

        int novaVelocidade = velocidade - decremento;
        if (novaVelocidade < 0) novaVelocidade = 0;

        velocidade = novaVelocidade;
        System.out.println("Desacelerando... Velocidade atual: " + velocidade + " km/h");
    }

    private int getIncrementoPorMarcha(int marcha) {
        return switch (marcha) {
            case 1 -> 1;
            case 2 -> 3;
            case 3 -> 5;
            case 4 -> 7;
            case 5 -> 9;
            case 6 -> 11;
            default -> 0;
        };
    }


}
