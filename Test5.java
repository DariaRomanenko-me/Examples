package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:\\Users\\Daria\\Desktop\\r.txt");
        Scanner sc = new Scanner(reader);
        while(sc.hasNextLine()) {
            String a = sc.nextLine().trim();
            if(a.length() == 0){
                continue;
            }
            char simb = a.charAt(a.length()-2);
            String f = a.split(" ")[0];
            if( simb == '3') {
                System.out.println(f);
            }
        }
    }
}