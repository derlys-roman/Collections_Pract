package org.example.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        notas.add(10.0);
        notas.add(20.0);
        notas.add(30.0);
        notas.add(40.0);
        notas.add(50.0);
        notas.add(60.0);
        notas.add(70.0);
        notas.add(80.0);
        System.out.println("Show the position of the list: 30.0 " + notas.indexOf(30.0));
        notas.add(3, 5.0);
        System.out.println("Show all elements:" + notas);
        System.out.println("Replace the value 40.0 to 6.0");
        notas.set(notas.indexOf(40.0), 6.0);
        System.out.println("Show all elements:" + notas);
        System.out.println("check if the value 50.0 is in the list: " + notas.contains(50.0));
        System.out.println("Show the 3 position of the list: " + notas.get(2));
        System.out.println("Show the smallest value of the list: " + Collections.min(notas));
        System.out.println("Show the biggest value of the list: " + Collections.max(notas));
        System.out.println("Show the sum of all values of the list: " + notas.stream().
                mapToDouble(Double::doubleValue).sum());
        //explaining the line above:
        //notas.stream() -> convert the list to stream
        //mapToDouble(Double::doubleValue) -> convert the stream to double
        //sum() -> sum all values of the stream
        System.out.println("Show the average of all values of the list: " + notas.stream().
                mapToDouble(Double::doubleValue).average());
        System.out.println("Remove the value 80.0 of the list");
        notas.remove(80.0);
        System.out.println("Show all elements:" + notas);
        System.out.println("Remove the value of the position 0 of the list");
        notas.remove(0);
        System.out.println("Remove all items minor than 30.0");
        notas.removeIf(nota -> nota < 30.0);
        System.out.println("Show all elements:" + notas);
        System.out.println("Remove all items of the list");
        notas.clear();
        System.out.println("Show all elements:" + notas);
        System.out.println("Check if the list is empty: " + notas.isEmpty());


    }
}
