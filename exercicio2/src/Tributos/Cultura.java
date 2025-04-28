package Tributos;

import java.util.Scanner;

public record Cultura(double value) implements Imposto {
    @Override
    public double calcularImposto() {
        return value * 1.04;
    }

    public static void impostoCultura(Scanner scanner){
        System.out.println("Infomar o valor: ");
        var value = scanner.nextDouble();
        var cultura = new Cultura(value);
        System.out.printf("O valor da cultura é: %.2f%n", cultura.calcularImposto());
    }
}
