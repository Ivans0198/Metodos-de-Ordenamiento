package com.algoritmos.sort;

public class MergeSort {

    public static long sort() {
        long a = System.nanoTime();
        int[] A = Util.obtenerArreglo();
        sort(A, 0, A.length - 1);
        long b = System.nanoTime();
        return b - a;
    }

    private static void sort(int A[], int izq, int der) {
        if (izq < der) {
            int m = (izq + der) / 2;
            sort(A, izq, m);
            sort(A, m + 1, der);
            merge(A, izq, m, der);
        }
    }

    private static void merge(int A[], int izq, int m, int der) {
        int i, j, k;
        int[] B = new int[A.length]; //array auxiliar
        for (i = izq; i <= der; i++)      //copia ambas mitades en el array auxiliar
            B[i] = A[i];

        i = izq;
        j = m + 1;
        k = izq;

        while (i <= m && j <= der) //copia el siguiente elemento más grande
            if (B[i] <= B[j])
                A[k++] = B[i++];
            else
                A[k++] = B[j++];

        while (i <= m)         //copia los elementos que quedan de la
            A[k++] = B[i++]; //primera mitad (si los hay)
    }
}
