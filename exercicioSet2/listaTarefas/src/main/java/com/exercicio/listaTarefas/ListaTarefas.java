package com.exercicio.listaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefas> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefasSet.add(new Tarefas(descricao));
    }


    public void removerTarefa(String descricao){
        if (tarefasSet.isEmpty()){
            System.out.println("A lista esta vazia");
            return;
        }
        Tarefas tarefaParaRemover = null;
        for (Tarefas t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover = t;
                break;
            }
        }
        if (tarefaParaRemover != null) {
            tarefasSet.remove(tarefaParaRemover);
            System.out.println("Tarefa removida com sucesso.");
        } else {
            System.out.println("Tarefa com a descrição \"" + descricao + "\" não foi encontrada.");
        }

        tarefasSet.remove(tarefaParaRemover);
    }


    public void exibirTarefas(){
        if (tarefasSet.isEmpty()){
            System.out.println("Tarefas nao encontradas");
        }else {
            System.out.println(tarefasSet);
        }
    }

    public int contarTarefas(){
        return tarefasSet.size();
    }

    public Set<Tarefas> obterTarefasConcluidas() {
        Set<Tarefas> tarefasConcluidas = new HashSet<>();

        for (Tarefas t : tarefasSet){
            if (t.isConclusao()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefas> obterTarefasPendentes() {
        Set<Tarefas> tarefasPendentes = new HashSet<>();

        for (Tarefas t : tarefasSet){
            if (t.isConclusao()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefas t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConclusao(true);
            }
        }
    }


    public void marcarTarefaPendente(String descricao) {
        Tarefas tarefaParaMarcarComoPendente = null;
        for (Tarefas t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }

        if (tarefaParaMarcarComoPendente != null) {
            if(tarefaParaMarcarComoPendente.isConclusao()) {
                tarefaParaMarcarComoPendente.setConclusao(false);
            }
        } else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    public void limparListaTarefas() {
        if(tarefasSet.isEmpty()) {
            System.out.println("A lista já está vazia!");
        } else {
            tarefasSet.clear();
        }
    }


}
