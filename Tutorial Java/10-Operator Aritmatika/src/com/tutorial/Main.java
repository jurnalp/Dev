package com.tutorial;

public class Main {
    public static void main(String[] args){
        // operasi aritmatika
        int var1=5;
        int var2=2;

        int hasil;



        // penjumlahan
        hasil = var1+var2;
        System.out.println(var1+"+"+var2+"="+hasil);

        // pengurangan
        hasil = var1-var2;
        System.out.printf("%d-%d=%d\n",var1,var2,hasil);

        // pembagian
        hasil = var1/var2;
        System.out.printf("%d/%d=%d\n",var1,var2,hasil);

        // perkalian
        hasil = var1*var2;
        System.out.printf("%d*%d=%d\n",var1,var2,hasil);

        // modulus
        hasil = var1%var2;
        System.out.printf("%d%%%d=%d\n",var1,var2,hasil);
    }
}
