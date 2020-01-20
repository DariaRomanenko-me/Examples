package com.company;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String srt = sc.nextLine();
        String [] mas = srt.split(" ");
        char [] let = new char[] {'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'ю', 'я', 'э'};
        String res = new String();
        for(int i = 0; i < mas.length; i++){
            if( mas[i].length() == 0){
                continue;
            }
            for( int j = 0; j < let.length; j++){
                if( mas[i].toLowerCase().charAt(0) == let[j]){
                    res += mas[i];
                }
            }
        }
        System.out.println(res);
    }
}