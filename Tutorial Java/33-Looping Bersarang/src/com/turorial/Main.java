package com.turorial;

public class Main {
    public static void main(String[] args){
        // looping bersarang
        // segitiga 1
        for(int i=0; i < 5; i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        // segitiga 2
        for(int i=0; i < 5; i++){
            for(int j=5;j>i;j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        // kotak
        for(int i=0; i<5;i++){
            for (int j=0;j<5;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        // segitiga
        for(int i=0; i<5;i++){
            for (int j=0;j<5;j++){
                System.out.print("* ");
                if(i==j){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        // segitiga
        for(int i=0; i<5;i++){
            for (int j=0;j<5;j++){
                System.out.print("* ");
                if((i+j)==4){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        // segitiga
        for(int i=0; i<9;i++){
            for (int j=0;j<9;j++){
                System.out.print("* ");
                if (i == j){
                    break;
                } else if((i+j)==8){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for(int s=0;s<5;s++){
            for(int t=0;t<5;t++){
                System.out.print("0 ");
            }
            System.out.print("\n");
        }
        



    }
}

