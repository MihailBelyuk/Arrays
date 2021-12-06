package com.tasks.arrays;

public class Task9 {
    public static void main(String[] args) {
        int[][] array8 = {{1, 1, 1, 1, 1}, {0, 1, 1, 1, 0}, {0, 0, 1, 0, 0}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 1}};
        int i, j;
        for (i = 0; i < array8.length; i++) {
            System.out.println();
            for (j = 0; j < array8[i].length; j++) {

                System.out.print(array8[i][j] + " ");
            }
        }
    }
}
