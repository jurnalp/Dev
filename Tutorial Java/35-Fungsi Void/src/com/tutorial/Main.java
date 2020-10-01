package com.tutorial;

public class Main {
    public static void main(String args[]){

        // void = hampa/kosong
        System.out.println(simpel());

        hello("apa kabar kamu?");
        selamatPagi("Budi");

    }

    // fungsi atau method dengan kembalian
    // menggunakan return
    private static float simpel(){
        return 9.70f;
    }

    // fungsi dengan void
    // tanpa kebalian
    private static void hello(String input){
        System.out.println(input);
    }

    private static void selamatPagi(String nama){
        System.out.println("selamat pagi "+nama);
    }
}
