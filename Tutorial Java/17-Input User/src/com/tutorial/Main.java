package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputUser=new Scanner(System.in);
        int panjang, lebar, luas,tinggi;

        System.out.print("panjang = ");
        panjang=inputUser.nextInt();
        System.out.print("lebar = ");
        lebar=inputUser.nextInt();
        System.out.println("=============");
        luas=panjang*lebar;
        System.out.println("Luas = "+luas);
        System.out.print("tinggi = ");
        tinggi=inputUser.nextInt();
        System.out.println("=============");
        System.out.println("Volume = "+(luas*tinggi));







        // menghitung luas
        // luas = panjang * lebar
    }
}
