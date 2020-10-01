package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // kalkulator switch case

        Scanner inputUser;
        float a,b;
        String operator;

        inputUser=new Scanner(System.in);

        System.out.print("nilai a: ");
        a=inputUser.nextFloat();
        System.out.print("operator: ");
        operator=inputUser.next();
        System.out.print("nilai b: ");
        b=inputUser.nextFloat();

        switch (operator){
            case "+":
                System.out.println("hasil : "+(a+b));
                break;
            case "-":
                System.out.println("hasil : "+(a-b));
                break;
            case "*":
                System.out.println("hasil : "+(a*b));
                break;
            case "/":
                System.out.println("hasil : "+(a/b));
                break;
            default:
                System.out.println("operator tidak ditemukan");

        }
    }
}
