package com.exercicio.contagemPalavras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContagemPalavrasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContagemPalavrasApplication.class, args);

		ContagemPalavras contagemLinguagens = new ContagemPalavras();

		System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

		// Adiciona linguagens e suas contagens
		contagemLinguagens.adicionarPalavras("Java", 2);
		contagemLinguagens.adicionarPalavras("Python", 8);
		contagemLinguagens.adicionarPalavras("JavaScript", 1);
		contagemLinguagens.adicionarPalavras("C#", 6);

		// Exibe a contagem total de linguagens
		System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

		// Encontra e exibe a linguagem mais frequente
		String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
		System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
	}

}
