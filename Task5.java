package com.tasks.arrays;

// ЧЕСТНО СКОПИПАСТЕННОЕ, ЧТОБЫ ПОТОМ ЛУЧШЕ РАЗОБРАТЬСЯ
public class Task5 {
    public static void main(String[] args) {
        int[] array2 = {0, 3, 12, 6, 4, 1025, 10, 11, 12, 56, 128};
        boolean flag = false;     // не ни одного такого числа
        for (int i = 0; i < array2.length; i++) {
            int number = array2[i];                    // число
            boolean isIncreasingNumber = true;        // предположим, что имеем дело с нужным числом

            // будем рассматривать число с конца, при этом последовательность цифр
            // должна быть строго УБЫВАЮЩЕЙ

            if ((number % 10) != number) {   // игнорируем одноразрядные числа
                while (number != 0) {
                    int lastDigit = number - ((number / 10) * 10);    // последняя цифра
                    number /= 10;
                    if (lastDigit <= number - ((number / 10) * 10)) {
                        isIncreasingNumber = false;
                        break;
                    }
                }
            } else {
                isIncreasingNumber = false;
            }

            if (isIncreasingNumber) {
                flag = true;
                System.out.print(array2[i]);
                break;
            }


        }
        if (flag == false) {
            System.out.println("Таких чисел в массиве нет");
        }
        System.out.println();
    }
}


