package org.example.set;

import java.util.Set;
import java.util.TreeSet;

public class OrdenacaoConjunto {
    public static void main(String[] args) {
        System.out.println("Ordem aleatória");
        Set<Series> minhasSeries = new java.util.HashSet<>(){{
            add(new Series("Game of Thrones", "fantasia", 60));
            add(new Series("dark", "drama", 60));
            add(new Series("that '70s show", "comédia", 25));
        }};
        for (Series serie: minhasSeries) System.out.println(serie.getNome() + " - " +
                serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("Ordem de inserção natural");
        Set<Series> minhasSeries1 = new TreeSet<>(minhasSeries);
        for (Series serie: minhasSeries1) System.out.println(serie.getNome() + " - " +
                serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem nome/genero/tempoEpisodio\t--");
        Set<Series> minhasSeries2 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries2.addAll(minhasSeries);
        for (Series serie: minhasSeries2) System.out.println(serie.getNome() + " - " +
                serie.getGenero() + " - " + serie.getTempoEpisodio());
    }
}
