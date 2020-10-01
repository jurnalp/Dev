package com.tutorial;

public class Main {
    public static void main(String[] args){

        // do while
        // hal yang ada di dalam do dikerjakan terlebih dahulu

        int i=0;

        System.out.println("<<start>>");
        do {
            if (i == 3){
                System.out.println("hello : 3");
            } else {
                System.out.printf("do: %d\n",i);
            }
            i++;
        }while (i<5);

        System.out.println("<<end>>");

    }
}
