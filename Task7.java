package com.tasks.arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] array = {10, 36, 42, 51, 5, 6, 9};
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minValue = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minValue = j;
                }
            }
            if (i != minValue) {
                int temp = array[i];
                array[i] = array[minValue];
                array[minValue] = temp;
            }
            System.out.println(array[i]);
        }
    }
}
