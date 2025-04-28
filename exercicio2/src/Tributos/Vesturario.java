package Tributos;

import java.util.Scanner;

public record Vesturario(double value) implements Imposto {
    @Override
    public double calcularImposto() {
        return value * 1.025;
    }

    public static void impostoVesturario(Scanner scanner){
        System.out.println("Infomar o valor: ");
        var value = scanner.nextDouble();
        var vestuario = new Vesturario(value);
        System.out.printf("O valor da cultura é: %.2f%n", vestuario.calcularImposto());
    }
}
