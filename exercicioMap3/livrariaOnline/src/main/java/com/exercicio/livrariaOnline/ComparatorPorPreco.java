package com.exercicio.livrariaOnline;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return Double.compare(o1.getValue().getPreco(), o2.getValue().getPreco());
    }
}
