package com.company;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("array size:");
        int I1 = in.nextInt();
        double[] mass = new double[I1];
        double Ar = 0, Res = 0;
        for (int i = 1; i < mass.length+1; i++){
            System.out.print("Nuber " + i + ": ");
            mass[i-1] = in.nextDouble();
            Ar += mass[i-1];
        }
        Ar /= mass.length;
        I1 = 0;
        for(Double D : mass){
            System.out.printf("Res %d: %5.2f \n", I1++, D*Ar);

        }
        System.out.println();
        //System.out.printf("Res: %5.2f %d %n", Res, mass.length);
    }
}
