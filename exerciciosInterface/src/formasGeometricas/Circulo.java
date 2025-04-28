package formasGeometricas;

import java.util.Scanner;

public record Circulo(double raio)  implements FormasGeometricas {
    private static final  double pi= 3.14;

    @Override
    public double getArea() {
        return pi * (raio * raio);
    }

    public static void criarCirculo(Scanner scanner ){
        System.out.println("Infome o valor o Raio: ");
        var raio = scanner.nextDouble();

        var circulo = new Circulo(raio);;
        System.out.printf("A área do circulo é: %.2f%n", circulo.getArea());
    }
}
