package com.tasks.arrays;

public class TasksOneAndTwo {
    public static void main(String[] args) {
        //1
        int[] array1 = new int[3];

        //2

        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) Math.round(Math.random() * 21);
            System.out.println(array2[i]);
        }
    }
}

