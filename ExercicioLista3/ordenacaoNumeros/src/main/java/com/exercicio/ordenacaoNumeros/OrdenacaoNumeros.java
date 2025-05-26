package com.exercicio.ordenacaoNumeros;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class OrdenacaoNumeros {

	private List<Integer> numerosList;

	public OrdenacaoNumeros() {
		this.numerosList = new ArrayList<>();
	}

	public void adicionarNumero(int numero){
		numerosList.add(numero);
		System.out.println("Número adicionado: " + numero);
	}

	public List<Integer> ordenarAscendente() {
		if (numerosList.isEmpty()) {
			throw new RuntimeException("A lista está vazia");
		}
		List<Integer> numeroAscendente = new ArrayList<>(numerosList);
		Collections.sort(numeroAscendente);
		return numeroAscendente;
	}

	public List<Integer> ordenarDecrecente() {
		if (numerosList.isEmpty()) {
			throw new RuntimeException("A lista está vazia");
		}
		List<Integer> numeroDescendente = new ArrayList<>(numerosList);
		numeroDescendente.sort(Collections.reverseOrder());
		return numeroDescendente;
	}


	public void exibirNumeros(){
		if (!numerosList.isEmpty()){
			System.out.println(this.numerosList);
		}else {
			System.out.println("A lista está vazia");
		}
	}



}
