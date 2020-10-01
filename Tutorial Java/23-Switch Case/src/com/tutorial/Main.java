package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String input;

        Scanner inputUser=new Scanner(System.in);
        System.out.print("pilih warna: ");
        input=inputUser.next();

        System.out.println(input);
        switch (input){
            case "merah":
                System.out.println("warna merah dipilih");
                break;
            case "biru":
                System.out.println("warna biru dipilih");
                break;
            case "kuning":
                System.out.println("warna kuning dipilih");
                break;
            default:
                System.out.println("warna tidak tersedia");
        }
    }
}
