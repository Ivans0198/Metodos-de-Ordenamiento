package com.algoritmos.sort;

public class InsertionSort {

    public static long sort() {
        int[] nums = Util.obtenerArreglo();
        long a = System.nanoTime();
        sort(nums);
        long b = System.nanoTime();
        return b - a;
    }

    private static void sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > value) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = value;
        }
    }
}
