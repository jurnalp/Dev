package com.tutorial;

public class Main {
    public static void main(String args[]){
        System.out.println("hello");
        // y = (x+2)*x
        int x,y;
        x=10;
        y=(x+2)*x;
        System.out.println("x ="+x+"->y ="+y);

        x=10;
        y=hitung(x);
        System.out.println("x ="+x+"->y ="+y);

        x=12;
        y=hitung(x);
        System.out.println("x ="+x+"->y ="+y);

        x=100;
        y=hitung(x);
        System.out.println("x ="+x+"->y ="+y);



    }
    private static int hitung(int a){
        int hasil;
        hasil=(a+2)*a;
        return hasil;
    }

}
