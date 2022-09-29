package com.company.java_core.homework11.task2;

import java.util.Arrays;
import java.util.Random;

public class Car implements Comparable<Car>{
    final Random random = new Random();
    private int horse;
    private int year;
    private int[][] data;

    public Car(int horse, int year, int[][] data) {
        this.horse = horse;
        this.year = year;
        this.data = data;

        Arrays.fill(data, 10);
    }

    public int getHorse() {
        return horse;
    }

    public void setHorse(int horse) {
        this.horse = horse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.horse, this.year);
    }
}
