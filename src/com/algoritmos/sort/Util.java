package com.algoritmos.sort;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

public class Util {

    public static int[] aleatorios;
    public static int n;

    public static int[] obtenerArreglo() {
        if (aleatorios == null) {
            aleatorios = crearArregloAleatorio();
        }
        return aleatorios;
    }

    private static int[] crearArregloAleatorio() {
        Random random = new Random();
        IntStream intStream = random.ints(n, 1, n);
        Iterator iterator = intStream.iterator();

        int[] arregloDesordenado = new int[n];
        int i = 0;
        while (iterator.hasNext()) {
            arregloDesordenado[i] = (int) iterator.next();
            i++;
        }
        return arregloDesordenado;
    }
}
