package geradorDeAlunos;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    Set<Alunos> alunosSet;

    public GerenciadorAlunos(){
        this.alunosSet = new HashSet<>();
    }


    public void adicionarAluno(String nome, Long matricula, double nota){
        alunosSet.add(new Alunos(nome, matricula, nota));

    }

    public void removerAluno(long matricula){
        Alunos alunoParaRemover = null;

        if(!alunosSet.isEmpty()){
            for(Alunos a : alunosSet){
                if (a.getMatricula() == matricula){
                    alunoParaRemover = a;
                    break;
                }
            }
            alunosSet.remove(alunoParaRemover);
        }else {
            throw new RuntimeException("O conjunto esta vazio");

        }
        if(alunoParaRemover == null){
            System.out.println("Matricula nao encontrada");
        }
    }


    public void exibirAlunosPorNome(){
        Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);
        if(!alunosSet.isEmpty()){
            System.out.println(alunosPorNome);
        }else {
            System.out.println("O conjunto esta vazio");
        }

    }

    public void exibirAlunosPorNota(){
        Set<Alunos> alunosPorNotas = new TreeSet<>(new ComparatorNota());
        if (!alunosSet.isEmpty()){
            alunosPorNotas.addAll(alunosSet);
            System.out.println(alunosPorNotas);
        }else {
            System.out.println("ta vazio ");
        }
    }

}
