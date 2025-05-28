package com.exercicio.listaTarefas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListaTarefasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListaTarefasApplication.class, args);


		// Criando uma instância da classe ListaTarefas
		ListaTarefas listaTarefas = new ListaTarefas();

		// Adicionando novas tarefas à lista
		listaTarefas.adicionarTarefa("Revisar código do projeto");
		listaTarefas.adicionarTarefa("Enviar relatório semanal");
		listaTarefas.adicionarTarefa("Atualizar repositório no GitHub");
		listaTarefas.adicionarTarefa("Planejar reunião com a equipe");
		listaTarefas.adicionarTarefa("Responder e-mails pendentes");

		// Exibindo as tarefas na lista
		listaTarefas.exibirTarefas();

		// Removendo uma tarefa
		listaTarefas.removerTarefa("Enviar relatório semanal");
		listaTarefas.exibirTarefas();

		// Contando o número de tarefas na lista
		System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

		// Obtendo tarefas pendentes
		System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

		// Marcando tarefas como concluídas
		listaTarefas.marcarTarefaConcluida("Revisar código do projeto");
		listaTarefas.marcarTarefaConcluida("Atualizar repositório no GitHub");

		// Obtendo tarefas concluídas
		System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());

		// Marcando tarefas como pendentes novamente
		listaTarefas.marcarTarefaPendente("Atualizar repositório no GitHub");
		listaTarefas.exibirTarefas();

		// Limpando a lista de tarefas
		listaTarefas.limparListaTarefas();
		listaTarefas.exibirTarefas();
	}



}
