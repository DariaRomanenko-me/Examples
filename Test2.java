package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] mass = new int[10];
        for( int i = 0; i < mass.length; i++){
            mass[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < mass.length; i++) {
            for( int j = i+1; j < mass.length; j++){
                if(mass[i] == mass[j]){
                if(!set.contains(mass[i])){
                    System.out.println(mass[i]);
                    set.add(mass[i]);
                }
                }
            }
        }
    }
}