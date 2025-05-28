package com.exercicio.palavrasUnicas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PalavrasUnicasApp {

	public static void main(String[] args) {
		SpringApplication.run(PalavrasUnicasApp.class, args);

		// Criando uma instância da classe ConjuntoPalavrasUnicas
		ConjuntoPalavrasUnicas conjuntoFrutas = new ConjuntoPalavrasUnicas();

		// Exibindo as frutas únicas no conjunto
		conjuntoFrutas.exibirPalavrasUnicas();

		// Adicionando frutas únicas ao conjunto
		conjuntoFrutas.adicionarPalavra("Maçã");
		conjuntoFrutas.adicionarPalavra("Banana");
		conjuntoFrutas.adicionarPalavra("Abacaxi");
		conjuntoFrutas.adicionarPalavra("Banana"); // Duplicado
		conjuntoFrutas.adicionarPalavra("Manga");
		conjuntoFrutas.adicionarPalavra("Uva");

		// Exibindo as frutas únicas no conjunto
		conjuntoFrutas.exibirPalavrasUnicas();

		// Removendo uma fruta do conjunto
		conjuntoFrutas.removerPalavra("Banana");
		conjuntoFrutas.exibirPalavrasUnicas();

		// Removendo uma fruta inexistente
		conjuntoFrutas.removerPalavra("Kiwi");

		// Verificando se uma fruta está no conjunto
		System.out.println("A fruta 'Maçã' está no conjunto? " + conjuntoFrutas.verificarPalavra("Maçã"));
		System.out.println("A fruta 'Banana' está no conjunto? " + conjuntoFrutas.verificarPalavra("Banana"));

		// Exibindo as frutas únicas atualizadas no conjunto
		conjuntoFrutas.exibirPalavrasUnicas();
	}


}
