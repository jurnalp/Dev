package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // ternary operator
        // variable x = ekspresi ? statement_true : statement_false

        int input,x;

        Scanner inputUser=new Scanner(System.in);
        System.out.print("masukkan nilai : ");
        input=inputUser.nextInt();


        x=(input==10) ? (input*input) : (input/2);
        System.out.println("hasilnya : "+x);

        // jika pakai if
//        if (input==10){
//            x=input*input;
//        }else {
//            x=input/2;
//        }

    }
}
