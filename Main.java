package com.company.java_core.homework11.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] integer = random.ints(10, 0, 100).toArray();

        System.out.println("The original array is: ");
        for (int num : integer) {
            System.out.print(num + " ");
        }
        Arrays.sort(integer);
        System.out.println("\nThe sorted array is: ");
        for (int num : integer) {
            System.out.print(num + " ");
        }

        //Arrays.sort(integer, Collections.reverseOrder());

        System.out.println("\nThe sorted array in decrease way is: " + Arrays.toString(integer));
    }
}
