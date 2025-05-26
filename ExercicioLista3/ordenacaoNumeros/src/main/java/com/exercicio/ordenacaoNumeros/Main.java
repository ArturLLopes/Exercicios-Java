package com.exercicio.ordenacaoNumeros;

public class Main {

    public static void main(String[] args) {
        OrdenacaoNumeros  numeros = new OrdenacaoNumeros();

        numeros.exibirNumeros();


        numeros.adicionarNumero(24);
        numeros.adicionarNumero(15);
        numeros.adicionarNumero(42);
        numeros.adicionarNumero(14);
        numeros.adicionarNumero(9);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);


        System.out.println(numeros.ordenarAscendente());

        numeros.exibirNumeros();


        System.out.println(numeros.ordenarDecrecente());



    }
}
