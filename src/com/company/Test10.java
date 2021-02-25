package com.company;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("array size x:");
        int x = in.nextInt();
        System.out.print("array size y:");
        int y = in.nextInt();
        int z;
        int[][] Ar = new int[x][y];
        for(int i = 0; i<x; i++ ){
            for(int j = 0; j<y; j++){
                System.out.print(" Value Ar["+i+"]["+j+"]");
                z = in.nextInt();
                Ar[i][j] = z;
            }
            System.out.println();
        }
        System.out.print("Result: ");
        for(int i=0;i<x;i++){
            System.out.printf("%d ", Ar[i][0]*3);
        }

    }
}
