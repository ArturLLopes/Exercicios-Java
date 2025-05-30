package com.exercicio.livrariaOnline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LivrariaOnlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivrariaOnlineApplication.class, args);

		LivrariaOnline livrariaOnline = new LivrariaOnline();

/*teste da NoSuchElementException

		System.out.println("Todos os livros cadastrados:");
		for (Livro livro : livrariaOnline.listarTodosOsLivros()) {
			System.out.println(livro);
		}

 */


		// Adiciona os livros à livraria online
		livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
		livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
		livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
		livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
		livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
		livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

		System.out.println("Todos os livros cadastrados:");
		for (Livro livro : livrariaOnline.listarTodosOsLivros()) {
			System.out.println(livro);
		}

		// Exibe todos os livros ordenados por preço
		System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

		//Exibe todos os livros ordenados por autor
		String autor = "Agatha Christie";
		System.out.println("Livros do autor " + autor + ": \n" + livrariaOnline.pesquisarLivrosPorAutor(autor));


		// Pesquisa livros por autor
		String autorPesquisa = "Josh Malerman";
		livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);
		System.out.println("Livros do autor " + autorPesquisa + ": \n" + livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa));


		// Obtém e exibe o livro mais caro
		System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

		// Obtém e exibe o livro mais barato
		System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());

		// Remover um livro pelo título
		livrariaOnline.removerLivro("1984");
		System.out.println("Livros após remoção: " + livrariaOnline.getLivros());

		System.out.println("Todos os livros cadastrados:");
		for (Livro livro : livrariaOnline.listarTodosOsLivros()) {
			System.out.println(livro);
		}
	}
}