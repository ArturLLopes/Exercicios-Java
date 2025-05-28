package com.exercicio.listaTarefas;

public class Tarefas {

    private String descricao;

    private boolean conclusao;

    public Tarefas(String descricao) {
        this.descricao = descricao;
        this.conclusao = conclusao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConclusao() {
        return conclusao;
    }

    public void setConclusao(boolean conclusao) {
        this.conclusao = conclusao;
    }

    @Override
    public String toString() {
        return "Tarefas{" +
                "descricao='" + descricao + '\'' +
                ", conclusao=" + conclusao +
                '}';
    }
}
