package Tributos;

import java.util.Scanner;

public record Alimentacao(double value) implements Imposto {
    @Override
    public double calcularImposto() {
        return value * 1.01;
    }

    public static void impostoAlimentacao(Scanner scanner){
        System.out.println("Infomar o valor: ");
        var value = scanner.nextDouble();
        var alimentacao = new Alimentacao(value);
        System.out.printf("O valor da alimentação e do bem estar é: %.2f%n", alimentacao.calcularImposto());
    }
}
