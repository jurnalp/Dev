package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // program untuk menjumlahkan rentang angka

        int nilaiAwal, nilaiAkhir, total;
        Scanner inputUser = new Scanner(System.in);


        System.out.println("<<while loop>>");

        System.out.print("masukkan nilai awal : ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("masukkan nilai akhir : ");
        nilaiAkhir = inputUser.nextInt();

        total = 0;
//        while (nilaiAwal<=nilaiAkhir){
//            total = total + nilaiAwal;
//
//            System.out.println("+"+nilaiAwal+" = "+total);
//            nilaiAwal++;
//        }

        System.out.println("<<do while loop>>");
//        do{
//            total = total + nilaiAwal;
//            System.out.println("+"+nilaiAwal+"="+total);
//            nilaiAwal++;
//        }while (nilaiAwal<=nilaiAkhir);



        System.out.println("<<for loop>>");
        for(; nilaiAwal<=nilaiAkhir; nilaiAwal++){
            total = total + nilaiAwal;
            System.out.println("+" + nilaiAwal+ "=" + total);

        }

    }
}
