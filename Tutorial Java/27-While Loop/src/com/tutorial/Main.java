package com.tutorial;

public class Main {
    public static void main(String[] args){

        // while loop : perulangan
        // menggunakan flowchart yang dianalogikan berulang (aksi)

        int i=0;

        System.out.println("----awal program");
        while (i<6){

            System.out.printf("while loop: %d\n",(i));
            if (i == 4){
                System.out.println("loop ketiga");
                break;

            }
            i++;
        }
        System.out.println("----end program");
//

    }
}
