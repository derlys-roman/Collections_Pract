package org.example.set;

import java.util.*;

public class ExampleSet {
    public static void main(String[] args) {

        System.out.println("crie um conjunto e adicione as notas: 7.0, 8.0, 9.3, 5.0, 7.0, 0.0, 3.6, 4.5");
        Set<Double> notas = new HashSet<>(Arrays.asList(7.0, 8.0, 9.3, 5.0, 7.0, 0.0, 3.6, 4.5));
        System.out.println(notas);
        System.out.println("confira se a nota 5.0 está no conjunto: " + notas.contains(5.0));
        System.out.println("exiba a menor nota: " + Collections.min(notas));
        System.out.println("exiba a maior nota: " + Collections.max(notas));
        System.out.println("exiba a soma dos valores: ");
        Double soma = 0.0;
        for (Double nota : notas) {
            soma += nota;
        }
        System.out.println(soma);
        System.out.println("exiba a média das notas: " + soma / notas.size());
        System.out.println("remova a nota 5.0: " );
        notas.remove(5.0);
        System.out.println(notas);
        System.out.println("remova as notas menores que 7 e exiba a lista: ");
        notas.removeIf(nota -> nota < 7.0);
        System.out.println(notas);
        System.out.println("exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7.0, 8.0, 9.3, 5.0, 7.0, 0.0, 3.6, 4.5));
        System.out.println(notas2);
        System.out.println("exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
        System.out.println("apague todo o conjunto: ");
        notas.clear();
        System.out.println("confira se o conjunto 1 está vazio: " + notas.isEmpty());
        System.out.println("confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("confira se o conjunto 3 está vazio: " + notas3.isEmpty());


    }
}
