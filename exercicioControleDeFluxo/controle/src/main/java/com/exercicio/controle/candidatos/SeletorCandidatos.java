package com.exercicio.controle.candidatos;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class SeletorCandidatos {
    private static final double SALARIO_BASE = 2000.0;
    private static final int NUM_VAGAS = 5;

    private final String[] candidatos = {
            "Ana", "Bruno", "Carlos", "Daniela", "Eduardo",
            "Fernanda", "Gabriel", "Helena", "Igor", "Juliana"
    };

    public List<String> selecionar() {
        List<String> selecionados = new ArrayList<>();
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;

        while (candidatosSelecionados < NUM_VAGAS && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = gerarSalarioPretendido();

            System.out.println("Candidato: " + candidato + " | Salário pretendido: " + salarioPretendido);

            if (SALARIO_BASE >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para vaga");
                selecionados.add(candidato);
                candidatosSelecionados++;
            }

            candidatosAtual++;
        }
        return selecionados;
    }

    private double gerarSalarioPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public void imprimirSelecionados(List<String> selecionados) {
        System.out.println("\nImprimindo a lista de candidatos selecionados:");
        for (int i = 0; i < selecionados.size(); i++) {
            System.out.println("O candidato de nº " + (i + 1) + " é o " + selecionados.get(i));
        }
    }

    /*
    outra forma de usar
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº " + (indice + 1) + " é o " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }

 */

}
