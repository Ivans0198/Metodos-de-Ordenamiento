package com.algoritmos.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public static long sort() {
        int[] intArr = Util.obtenerArreglo();
        long a = System.nanoTime();
        sort(intArr);
        long b = System.nanoTime();
        return b - a;
    }

    public static void sort(int[] input) {
        final int[] code = hash(input);

        // create and initialize buckets to ArrayList: O(n)
        List[] buckets = new List[code[1]];
        for (int i = 0; i < code[1]; i++) {
            buckets[i] = new ArrayList();
        }

        // distribute data into buckets: O(n)
        for (int i : input) {
            buckets[hash(i, code)].add(i);
        }

        // sort each bucket O(n)
        for (List bucket : buckets) {
            Collections.sort(bucket);
        }

        int ndx = 0;
        // merge the buckets: O(n)
        for (int b = 0; b < buckets.length; b++) {
            for (Object v : buckets[b]) {
                input[ndx++] = (int) v;
            }
        }
    }

    /**
     * @param input
     * @return an array containing hash of input
     */
    private static int[] hash(int[] input) {
        int m = input[0];
        for (int i = 1; i < input.length; i++) {
            if (m < input[i]) {
                m = input[i];
            }
        }
        return new int[]{m, (int) Math.sqrt(input.length)};
    }

    private static int hash(int i, int[] code) {
        return (int) ((double) i / code[0] * (code[1] - 1));
    }
}
