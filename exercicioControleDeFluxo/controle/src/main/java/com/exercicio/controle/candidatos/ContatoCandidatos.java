package com.exercicio.controle.candidatos;

import java.util.Random;

public class ContatoCandidatos {
    private static final int MAX_TENTATIVAS = 3;
    private final Random random = new Random();

    public void entrarEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean atendeu = false;

        while (tentativasRealizadas <= MAX_TENTATIVAS && !atendeu) {
            atendeu = atender();
            if (!atendeu) {
                tentativasRealizadas++;
            } else {
                System.out.println("\nCONTATO REALIZADO COM SUCESSO");
            }
        }

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "ª TENTATIVA");
        } else {
            System.out.println("\nNÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS ALCANÇADO");
        }
    }

    private boolean atender() {
        return random.nextInt(3) == 1;
    }

}
