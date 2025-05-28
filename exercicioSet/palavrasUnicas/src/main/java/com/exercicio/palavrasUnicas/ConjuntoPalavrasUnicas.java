package com.exercicio.palavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavraUnicaSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraUnicaSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraUnicaSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (palavraUnicaSet.isEmpty()){
            System.out.println("O conjunto esta vazio");
        }else if (palavraUnicaSet.remove(palavra)){
            System.out.println(palavra + " Removida com sucesso");

        }else {
            System.out.println( palavra + " nao encontrada");
        }

    }

    public boolean verificarPalavra(String palavra){
        return palavraUnicaSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if (palavraUnicaSet.isEmpty()){
            System.out.println("O conjunto esta vazio");
        }else {
            System.out.println(palavraUnicaSet);
        }

    }


}
