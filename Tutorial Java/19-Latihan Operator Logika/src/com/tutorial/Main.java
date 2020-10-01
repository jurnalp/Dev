package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // input user
        Scanner inputUser=new Scanner(System.in);

        // program menebak sebuah angka
        int nilaiBenar, nilaiTebakan;
        boolean statusTebakan;
        nilaiBenar=6;

        System.out.print("masukkan nilai tebakan anda : ");
        nilaiTebakan=inputUser.nextInt();
        System.out.println("nilai tebakan anda : "+nilaiTebakan);

        statusTebakan=(nilaiTebakan==nilaiBenar);
        System.out.println("tebakan anda : "+statusTebakan);

        System.out.print("masukkan nilai diantara 3 - 9: ");
        nilaiTebakan = inputUser.nextInt();
        statusTebakan= ((nilaiTebakan>3) && (nilaiTebakan<9));
        System.out.println("tebakan anda : "+statusTebakan);



    }
}
