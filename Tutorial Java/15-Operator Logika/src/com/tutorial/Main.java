package com.tutorial;

public class Main {
    public static void main(String[] args){
        // operator logika.. operasi yang bisa kita lakukan kepada tipe data boolean
        // OR , AND, XOR, negasi
        boolean a, b, c;

        // OR , atau ,||
        System.out.println("===== OR =====");
        a=true;
        b=true;
        c=(a||b);
        System.out.println(a +" || "+ b+" = "+c);
        a=true;
        b=false;
        c=(a||b);
        System.out.println(a +" || "+ b+" = "+c);
        a=false;
        b=true;
        c=(a||b);
        System.out.println(a +" || "+ b+" = "+c);
        a=false;
        b=false;
        c=(a||b);
        System.out.println(a +" || "+ b+" = "+c);

        // AND , dan ,&&
        System.out.println("===== AND =====");
        a=true;
        b=true;
        c=(a&&b);
        System.out.println(a +" && "+ b+" = "+c);
        a=true;
        b=false;
        c=(a&&b);
        System.out.println(a +" && "+ b+" = "+c);
        a=false;
        b=true;
        c=(a&&b);
        System.out.println(a +" && "+ b+" = "+c);
        a=false;
        b=false;
        c=(a&&b);
        System.out.println(a +" && "+ b+" = "+c);

        // XOR , exlusif or ,^
        System.out.println("===== XOR =====");
        a=true;
        b=true;
        c=(a^b);
        System.out.println(a +" ^ "+ b+" = "+c);
        a=true;
        b=false;
        c=(a^b);
        System.out.println(a +" ^ "+ b+" = "+c);
        a=false;
        b=true;
        c=(a^b);
        System.out.println(a +" ^ "+ b+" = "+c);
        a=false;
        b=false;
        c=(a^b);
        System.out.println(a +" ^ "+ b+" = "+c);

        // NOT .. negasi .. !
        System.out.println("===== NEGASI =====");
        a=true;
        c=!a;
        System.out.println(a+" ! "+c);
        a=false;
        c=!a;
        System.out.println(a+" ! "+c);



    }
}
