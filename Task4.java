package com.tasks.arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array4 = {0, 3, 12, 6, 4, 1025, 10, 11, 12, 56, 128};

        for (int i = 0; i < array4.length; i++) {
            int j = array4[i];
            if (j / 10 > 0 && j / 10 < 10)
                System.out.println(j+ " - двузначное число");
        }
    }
}

