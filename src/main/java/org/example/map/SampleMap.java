package org.example.map;

import java.util.*;

public class SampleMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos:");
        Map<String, Double> carrosPopulares = new HashMap<>(){{

            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15,2 km/l:");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionário:"
                + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno:" + carrosPopulares.get("uno"));

        System.out.println("Exiba o terceiro modelo adicionado:"
                + carrosPopulares.keySet().toArray()[2]);

        System.out.println("Exiba os modelos:" + carrosPopulares.keySet());

        System.out.println("Exiba os consumos dos carros:" + carrosPopulares.values());

        // get the key of the max value
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(Collections.max(carrosPopulares.values()))) {
                System.out.println("Exiba o modelo mais econômico e seu consumo:"
                        + entry.getKey() + " - " + entry.getValue());
            }
        }

        System.out.println("Exiba o modelo menos econômico e seu consumo:"
                + Collections.min(carrosPopulares.entrySet(), Map.Entry.comparingByValue()));

        System.out.println("Exiba a soma dos consumos:");
        Double soma = 0d;

        for (Double consumo : carrosPopulares.values()) {
            soma += consumo;
        }
        System.out.println(soma);

        System.out.println("Exiba a média dos consumos deste dicionário de carros:"
                + (soma / carrosPopulares.size()));

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l:");
        System.out.println(carrosPopulares);
        carrosPopulares.values().removeIf(consumo -> consumo.equals(15.6));
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem em que foram informados:");

        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{

            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares2);

        System.out.println("Exiba o dicionário ordenado pelo modelo:");
        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
        System.out.println(carrosPopulares3);

        System.out.println("Apague o dicionário de carros:");
        carrosPopulares.clear();
        System.out.println("esta vazio?" + carrosPopulares.isEmpty());
    }
}
