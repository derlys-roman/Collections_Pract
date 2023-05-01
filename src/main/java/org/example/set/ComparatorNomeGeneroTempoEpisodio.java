package org.example.set;

import java.util.Comparator;

public class ComparatorNomeGeneroTempoEpisodio implements Comparator<Series> {
    @Override
    public int compare(Series o1, Series o2) {
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if (nome != 0) return nome;

        int genero = o1.getGenero().compareToIgnoreCase(o2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(o1.getTempoEpisodio(), o2.getTempoEpisodio());
    }
}
