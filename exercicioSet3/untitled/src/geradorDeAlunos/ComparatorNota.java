package geradorDeAlunos;

import java.util.Comparator;

public class ComparatorNota implements Comparator<Alunos> {

    public int compare(Alunos o1,Alunos o2){
        return Double.compare(o1.getNota(), o2.getNota());
    }

}
