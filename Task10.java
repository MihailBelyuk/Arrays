package com.tasks.arrays;

public class Task10 {
    public static void main(String[] args) {
// start position
        int[][] array1 = {{1, 2, 3, 0, 0}, {0, 0, 4, 0, 0}, {0, 0, 5, 0, 0}, {0, 0, 6, 0, 0}, {0, 0, 7, 8, 9}};
        int i, j;
        for (i = 0; i < array1.length; i++) {
            System.out.println();
            for (j = 0; j < array1[i].length; j++)
                System.out.print(array1[i][j] + " ");
        }
        System.out.println();
// 90 degrees
        int[][] array2 = {{1, 2, 3, 0, 0}, {0, 0, 4, 0, 0}, {0, 0, 5, 0, 0}, {0, 0, 6, 0, 0}, {0, 0, 7, 8, 9}};
        int a, b;
        for (a = array2.length - 1; a >= 0; a--) {
            System.out.println();
            for (b = 0; b < array2.length; b++)
                System.out.print(array2[b][a] + " ");
        }
        System.out.println();
// 180 degrees
        int[][] array3 = {{1, 2, 3, 0, 0}, {0, 0, 4, 0, 0}, {0, 0, 5, 0, 0}, {0, 0, 6, 0, 0}, {0, 0, 7, 8, 9}};
        int c, d;
        for (c = array3.length - 1; c >= 0; c--) {
            System.out.println();
            for (d = array3.length - 1; d >= 0; d--)
                System.out.print(array3[c][d] + " ");
        }
        System.out.println();
// 270 degrees
        int[][] array4 = {{1, 2, 3, 0, 0}, {0, 0, 4, 0, 0}, {0, 0, 5, 0, 0}, {0, 0, 6, 0, 0}, {0, 0, 7, 8, 9}};
        int e, f;
        for (e = 0; e < array4.length; e++) {
            System.out.println();
            for (f = array4.length - 1; f >= 0; f--)
                System.out.print(array4[f][e] + " ");

        }
    }
}
