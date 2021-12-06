package com.tasks.arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array3 = {15, 12, 6, 4, 10, 11, 12, 56, 128};
        int minValue = array3[0];
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < minValue) {
                minValue = array3[i];
            }
        }
        System.out.println("минимальное значение " + minValue);
        System.out.println();
//
        int maxValue = array3[8];
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] > maxValue) {
                maxValue = array3[i];
            }
        }
        System.out.println("максимальное значение " + maxValue);
        System.out.println();

        double sum = 0;
        double middleValue;
        for (int i = 0; i < array3.length; i++)
            sum = sum + array3[i];
        middleValue = sum / array3.length;

        System.out.println("среднее значение " + middleValue);
        System.out.println();
    }
}

