package com.algoritmos;

import com.algoritmos.sort.*;

import java.math.BigDecimal;

import static javax.swing.JOptionPane.showInputDialog;

public class Main {

    public static void main(String[] args) {

        String n = showInputDialog(null, "Ingrese el tamaño del arreglo: ");
        Util.n = Integer.parseInt(n);

        long buckerSortTime = BucketSort.sort();
        long insertionSortTime = InsertionSort.sort();
        long mergeSortTime = MergeSort.sort();
        long quickSortTime = QuickSort.sort();
        long shellSortTime = ShellSort.sort();

        String[][] resultados = {
                {"Bucket Sort", String.valueOf(buckerSortTime), String.valueOf(nanoAMili(buckerSortTime)), String.valueOf(nanoASec(buckerSortTime))},
                {"Insertion Sort", String.valueOf(insertionSortTime), String.valueOf(nanoAMili(insertionSortTime)), String.valueOf(nanoASec(insertionSortTime))},
                {"Merge Sort", String.valueOf(mergeSortTime), String.valueOf(nanoAMili(mergeSortTime)), String.valueOf(nanoASec(mergeSortTime))},
                {"Quick Sort", String.valueOf(quickSortTime), String.valueOf(nanoAMili(quickSortTime)), String.valueOf(nanoASec(quickSortTime))},
                {"Shell Sort", String.valueOf(shellSortTime), String.valueOf(nanoAMili(shellSortTime)), String.valueOf(nanoASec(shellSortTime))}
        };
        new TablaResultados(resultados);
    }

    public static BigDecimal nanoAMili(long nano) {
        return BigDecimal.valueOf(nano * Math.pow(10, -6));
    }

    public static BigDecimal nanoASec(long nano) {
        return BigDecimal.valueOf(nano * Math.pow(10, -9));
    }
}
