package formasGeometricas;

import java.util.Scanner;

public record Retangulo(double altura, double base) implements FormasGeometricas {
    @Override
    public double getArea() {
        return base * altura;
    }

    public static void criarRetangulo(Scanner scanner ){
        System.out.println("Infome o valor da altura: ");
        var altura = scanner.nextDouble();
        System.out.println("Infome o valor da base: ");
        var base = scanner.nextDouble();

        var retangulo =new Retangulo(altura, base);
        System.out.printf("A área do quadrado é: %.2f%n", retangulo.getArea());
    }
}
