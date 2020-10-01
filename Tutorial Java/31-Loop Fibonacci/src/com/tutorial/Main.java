package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // deret fibonacci

        // menghitung nilai deret fibonacci ke-n
        int f_n, f_n_1, f_n_2, n;
        Scanner inputUser = new Scanner(System.in);
        System.out.println("deret fibonacci");

        System.out.print("deret ke-n: ");
        n = inputUser.nextInt();

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;


//        for(int i=0; i < n; i++){
//            System.out.println("nilai ke- "+i+" ="+f_n);
//            f_n = f_n_1 + f_n_2;
//            f_n_2 = f_n_1;
//            f_n_1 = f_n;
//        }

        int i = 0;
//        while (i < n){
//            System.out.println("nilai ke- "+i+" ="+f_n);
//            f_n = f_n_1 + f_n_2;
//            f_n_2 = f_n_1;
//            f_n_1 = f_n;
//            i++;

//        }
        do{
            System.out.println("nilai ke- "+i+" ="+f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
            i++;
            
        }while (i < n);



    }
}
