package com.company;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Test7 {
    public static void main(String[] args) {
        final int C1 = 9, C2 = 5, C3= 1;
        Scanner in = new Scanner(System.in);
        System.out.print("array size:");
        int I1 = in.nextInt();
        int[] mass = new int[I1];
        for (int i = 1; i < mass.length+1; i++){
            System.out.print("Nuber " + i + ": ");
            mass[i-1] = in.nextInt();
        }
        boolean b = IntStream.of(mass).anyMatch(x -> ((x == C1)||(x == C2)||(x == C3)));
        if(b){
            System.out.println("Данное значение имеется в константах");
        }
    }
}
