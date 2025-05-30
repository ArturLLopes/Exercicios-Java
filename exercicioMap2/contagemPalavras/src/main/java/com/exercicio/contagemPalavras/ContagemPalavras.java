package com.exercicio.contagemPalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, Integer contagem){
        palavras.put(palavra, contagem);
    }

    public void removerPalavras(String palavra){
        if (!palavras.isEmpty()){
            palavras.remove(palavra);

        }else {
            System.out.println("esta vazio");
        }
    }

    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        for (int contagem : palavras.values()){
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;

    }
}
