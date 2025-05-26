package com.exercicio.soma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
        System.out.println("Número adicionado: " + numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for(int numero : numeros){
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() throws IllegalAccessException {
        if (numeros.isEmpty()){
            throw new IllegalAccessException("A lista esta vazia");
        }
        return Collections.max(numeros);
    }

    public int encontrarMenorNumero() throws IllegalAccessException {
        if (numeros.isEmpty()){
            throw new IllegalAccessException("A lista esta vazia");
        }
        return Collections.min(numeros);
    }

    public List<Integer> exibirNumeros(){
        return new ArrayList<>(numeros);
    }

}
