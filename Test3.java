package com.company;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Random rd = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = rd.nextInt(5) + 1;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += matrix[i][4 - i];
        }
        double sred = sum / 5.0;
        System.out.println("Среднее значение: " + sred);
    }
}