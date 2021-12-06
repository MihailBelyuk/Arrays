package com.tasks.arrays;

public class Task10 {
    public static void main(String[] args) {
// start position
        int[][] array = {{1, 2, 3, 0, 0}, {0, 0, 4, 0, 0}, {0, 0, 5, 0, 0}, {0, 0, 6, 0, 0}, {0, 0, 7, 8, 9}};
        int i, j;
        for (i = 0; i < array.length; i++) {
            System.out.println();
            for (j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + " ");
        }
        System.out.println();
// 90 degrees

        int a, b;
        for (a = array.length - 1; a >= 0; a--) {
            System.out.println();
            for (b = 0; b < array.length; b++)
                System.out.print(array[b][a] + " ");
        }
        System.out.println();
// 180 degrees

        int c, d;
        for (c = array.length - 1; c >= 0; c--) {
            System.out.println();
            for (d = array.length - 1; d >= 0; d--)
                System.out.print(array[c][d] + " ");
        }
        System.out.println();
// 270 degrees

        int e, f;
        for (e = 0; e < array.length; e++) {
            System.out.println();
            for (f = array.length - 1; f >= 0; f--)
                System.out.print(array[f][e] + " ");

        }
    }
}
