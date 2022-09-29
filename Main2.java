package com.company.java_core.homework11.task2;

import java.util.Arrays;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        final Random random = new Random();

        int[][] arr = new int[random.nextInt(1, 10)][random.nextInt(1, 10)];

        Car car = new Car(random.nextInt(), random.nextInt(), arr);

        System.out.println(Arrays.deepToString(arr));
    }
}
