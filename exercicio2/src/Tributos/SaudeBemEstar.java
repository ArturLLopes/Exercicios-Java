package Tributos;

import java.util.Scanner;

public record SaudeBemEstar(double value) implements  Imposto {
    @Override
    public double calcularImposto() {
        return value * 1.015;
    }

    public static void impostoSaudeBemEstar(Scanner scanner){
        System.out.println("Infomar o valor: ");
        var value = scanner.nextDouble();
        var saudeBemEstar = new SaudeBemEstar(value);
        System.out.printf("O valor da saude e do bem estar é: %.2f%n", saudeBemEstar.calcularImposto());
    }
}
