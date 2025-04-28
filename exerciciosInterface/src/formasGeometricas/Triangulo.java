package formasGeometricas;

import java.util.Scanner;

public record Triangulo(double base, double altura) implements FormasGeometricas {
    @Override
    public double getArea() {
        return (base* altura)/2;
    }

    public static void criarTriangulo(Scanner scanner ){
        System.out.println("Infome o valor da altura: ");
        var altura = scanner.nextDouble();
        System.out.println("Infome o valor da base: ");
        var base = scanner.nextDouble();

        var triangulo =new Triangulo(base, altura);
        System.out.printf("A área do quadrado é: %.2f%n", triangulo.getArea());
    }
}
