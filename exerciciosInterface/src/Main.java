import formasGeometricas.*;

import java.util.Scanner;

import static formasGeometricas.Circulo.criarCirculo;
import static formasGeometricas.Quadrado.criarQuadrado;
import static formasGeometricas.Retangulo.criarRetangulo;

public class Main {

        private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int option;

        do {
            System.out.println("Escolha a forma geometrica para calcular a area");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retangulo");
            System.out.println("3 - Circulo");
            System.out.println("4 - Triangulo");
            System.out.println("5 - Sair");
            option = scanner.nextInt();


            switch (option){
                case 1 -> Quadrado.criarQuadrado(scanner);

                case 2 -> Retangulo.criarRetangulo(scanner);

                case 3 -> Circulo.criarCirculo(scanner);

                case 4 -> Triangulo.criarTriangulo(scanner);

                case 5 -> System.out.println("Saindo...");

                default -> System.out.println("Opção inválida!");

            }
        }while (option!=5);

    }


}
