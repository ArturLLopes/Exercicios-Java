package formasGeometricas;

import java.util.Scanner;

public record Quadrado(int lado) implements FormasGeometricas {
    @Override
    public double getArea() {
        return lado * lado;
    }

    public static void criarQuadrado(Scanner scanner ) {
        System.out.println("Informe o valor dos lados: ");
        var lado = scanner.nextDouble();

        var quadrado = new Quadrado((int) lado);
        System.out.printf("A área do quadrado é: %.2f%n", quadrado.getArea());
    }

}
