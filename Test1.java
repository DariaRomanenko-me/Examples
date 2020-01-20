package com.company;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел в последовательности: ");
        int count = sc.nextInt();
        for( int i = 0; i < count; i++ ){
            int a = sc.nextInt();
            if( a > 10 && a < 20){
                System.out.println(a);
            }
        }
    }
}