package org.example.list;

import java.util.List;

public class Temperatura {
    //faça um programa que calcule a média de temperatura dos 6 primeiros meses do ano e armazene-as em uma
    //lista de temperaturas. Após isto, calcule a média semestral da temperatura e mostre todas as temperaturas
    //acima desta média, e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).

    private final List<Double> temperaturas;

    public Temperatura(List<Double> temperaturas) {
        this.temperaturas = temperaturas;
    }

    public static void main(String[] args) {
        List<Double> temperaturas = List.of(30.0, 31.0, 32.0, 33.0, 34.0, 35.0);
        Temperatura temperatura = new Temperatura(temperaturas);
        temperatura.mediaSemestral();

    }

    private void mediaSemestral() {
        double soma = 0;
        for (Double temperatura : temperaturas) {
            soma += temperatura;
        }
        double media = soma / temperaturas.size();
        System.out.println("Média semestral: " + media);
        System.out.println("Meses com temperatura acima da média: ");
        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > media) {
                System.out.println(i + 1);
            }
        }

    }

}
