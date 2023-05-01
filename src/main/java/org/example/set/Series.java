package org.example.set;

import java.util.Objects;

class Series implements Comparable<Series> {
    private final String nome;
    private final String genero;
    private final Integer tempoEpisodio;

    public Series(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" + "nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return nome.equals(series.nome) &&
                genero.equals(series.genero) &&
                tempoEpisodio.equals(series.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }


    @Override
    public int compareTo(Series o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
}

