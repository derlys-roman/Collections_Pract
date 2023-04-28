package org.example.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crime {
    //Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
    //1. "Telefonou para a vítima?"
    //2. "Esteve no local do crime?"
    //3. "Mora perto da vítima?"
    //4. "Devia para a vítima?"
    //5. "Já trabalhou com a vítima?"
    //O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa
    //responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice"
    //e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

    private final List<Boolean> respostas;

    public Crime(List<Boolean> respostas) {
        this.respostas = respostas;
    }

    public static void main(String[] args) {
        List<Boolean> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String respostaTerminal;
        System.out.println("Responda as perguntas com sim ou não");
        System.out.println("Telefonou para a vítima?");
        respostaTerminal = scanner.nextLine();
        extracted(respostas, respostaTerminal);
        System.out.println("Esteve no local do crime?");
        respostaTerminal = scanner.nextLine();
        extracted(respostas, respostaTerminal);
        System.out.println("Mora perto da vítima?");
        respostaTerminal = scanner.nextLine();
        extracted(respostas, respostaTerminal);
        System.out.println("Devia para a vítima?");
        respostaTerminal = scanner.nextLine();
        extracted(respostas, respostaTerminal);
        System.out.println("Já trabalhou com a vítima?");
        respostaTerminal = scanner.nextLine();
        extracted(respostas, respostaTerminal);
        scanner.close();
        Crime crime = new Crime(respostas);
        crime.classificar();


    }

    private void classificar() {
        int contador = 0;
        for (Boolean resposta : respostas) {
            if (resposta) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.println("Suspeito");
        } else if (contador == 3 || contador == 4) {
            System.out.println("Cúmplice");
        } else if (contador == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
    }

    private static void extracted(List<Boolean> respostas, String resposta) {
        if (resposta.equals("sim")) {
            respostas.add(true);
        } else {
            respostas.add(false);
        }
    }

}
