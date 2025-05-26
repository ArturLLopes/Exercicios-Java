package com.exercicio.soma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Calculadora {

	public static void main(String[] args) throws IllegalAccessException {
		SpringApplication.run(Calculadora.class, args);


		SomaNumeros sn = new SomaNumeros();
		//teste da exception
//		System.out.println("Maior número: " + sn.encontrarMaiorNumero());
//		System.out.println("Menor número: " + sn.encontrarMenorNumero());

		sn.adicionarNumero(10);
		sn.adicionarNumero(25);
		sn.adicionarNumero(5);
		sn.adicionarNumero(42);

		System.out.println("Números adicionados: " + sn.exibirNumeros());
		System.out.println("Soma dos números: " + sn.calcularSoma());
		System.out.println("Maior número: " + sn.encontrarMaiorNumero());
		System.out.println("Menor número: " + sn.encontrarMenorNumero());
	}

}
