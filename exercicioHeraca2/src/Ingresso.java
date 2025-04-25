import java.util.Scanner;

public sealed abstract class Ingresso permits FamiliaIngresso,  MeiaIngresso, PadraoIngresso {

    protected double valor;

    protected String nome;

    protected boolean legendado;

    public Ingresso(double valor, String nome, boolean legendado) {
        this.valor = valor;
        this.nome = nome;
        this.legendado = legendado;
    }


    public abstract double getValorReal();

    public void imprimirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Legendado: " + (legendado ? "Sim" : "Não"));
        System.out.println("Valor Total: " + getValorReal());
    };

    public static Ingresso criarIngresso(Scanner scanner, double valorBase) {
        return null;
    }
}