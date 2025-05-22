package com.exercicio.controle;

import com.exercicio.controle.candidatos.ContatoCandidatos;
import com.exercicio.controle.candidatos.SeletorCandidatos;

import java.util.List;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        SeletorCandidatos seletor = new SeletorCandidatos();
        List<String> selecionados = seletor.selecionar();

        seletor.imprimirSelecionados(selecionados);

        ContatoCandidatos contato = new ContatoCandidatos();
        for (String candidato : selecionados) {
            contato.entrarEmContato(candidato);
        }
    }
}