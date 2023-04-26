package org.example.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacao {
    public static void main(String[] args) {

        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};
        System.out.println("Ordenando oderm de inserção");
        System.out.println(gatos);
        System.out.println("Ordem aleatória");
        Collections.shuffle(gatos);
        System.out.println(gatos);
        System.out.println("Ordenando por nome");
        Collections.sort(gatos);
        System.out.println(gatos);
        System.out.println("Ordenando por idade");
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);
        System.out.println("Ordenando por cor");
        gatos.sort(new ComparatorCor());
        System.out.println(gatos);
        System.out.println("Ordenando por nome/idade/cor");
        gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos);


    }

}
