package com.tutorial;

public class Main {
    public static void main(String[] args){
        // nested if
        System.out.println("awal program");
        int a=9;
        if(a>=5){
            if(a==9){
                System.out.println("aksi ");
            }else {
                System.out.println("aksi default 2");
            }
        }else {
            System.out.println("aksi default 1");
        }
        System.out.println("end program");
    }
}
