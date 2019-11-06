package com.example.lib;

import java.util.Scanner;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入任意大小寫英文");
        String string = scanner.next();
        for(int i=0;i<string.length();i++) {
            char c= string.charAt(i);
            if (isUpperCase(c))
                System.out.print(toLowerCase(c));
            else if(isLowerCase(c))
                System.out.print(toUpperCase(c));
        }


    }
}
