package com.company;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("value:");
        int I1 = in.nextInt();
        double res = Math.pow(((I1+1)/2) , 2);
        System.out.println("Resultat: " + res);
    }
}
