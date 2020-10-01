package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // a operator b

        float a,b,c;
        char operator;
        Scanner inputUser;

        inputUser = new Scanner(System.in);
        System.out.print("nilai a: ");
        a=inputUser.nextFloat();
        System.out.print("operator: ");
        operator=inputUser.next().charAt(0);
        System.out.print("nilai b: ");
        b=inputUser.nextFloat();

        System.out.println("input user: "+a+" "+operator+" "+b);

        // operator tersedia
        if(operator=='+'){
            // penjumlahan
            c=a+b;
            System.out.println("hasil : "+c);
        }else if(operator=='-'){
            // pengurangan
            c=a-b;
            System.out.println("hasil : "+c);
        }else if(operator=='*'){
            // perkailian
            c=a*b;
            System.out.println("hasil : "+c);
        }else if(operator=='/'){
            // pembagian
            if(b==0){
                System.out.println("error : pembagi nol");
            }else {
                c=a/b;
                System.out.println("hasil : "+c);
            }
        }else {
            System.out.println("operator tidak tersedia");
        }


    }
}
