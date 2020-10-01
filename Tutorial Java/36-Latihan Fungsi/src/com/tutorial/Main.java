package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner inputUser= new Scanner(System.in);
        System.out.print("panjang :");
        int inputPanjang=inputUser.nextInt();
        System.out.print("lebar :");
        int inputLebar=inputUser.nextInt();

        gambar(inputPanjang,inputLebar);

        System.out.println("luas :"+luas(inputPanjang,inputLebar));
        System.out.println("keliling :"+keliling(inputPanjang,inputLebar));
        luasKeliling(inputPanjang,inputLebar);


    }
    private static void gambar(int panjang,int lebar){
        for(int a=0;a<lebar;a++){
            for (int b=0;b<panjang;b++){
                System.out.print("0 ");
            }
            System.out.print("\n");
        }
    }

    private static int luas(int panjang, int lebar){
        return panjang*lebar;

    }
    private static int keliling(int panjang, int lebar){
        return (panjang+lebar)*2;
    }
    private static void luasKeliling(int panjang,int lebar){
        System.out.println("luas :"+luas(panjang,lebar));
        System.out.println("keliling :"+keliling(panjang,lebar));
    }

}
