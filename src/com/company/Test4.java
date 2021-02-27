package com.company;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double Sum = 0;
        System.out.print("Input x: ");
        double I = in.nextDouble();
        Sum = Sum + I;
        System.out.print("Input y: ");
        I = in.nextDouble();
        Sum += I;
        System.out.print("Input z: ");
        I = in.nextDouble();
        Sum = (Sum + I) / 3;
        System.out.printf("Result: %5.2f \n", (Math.floor(Sum*100)/100));
        in.close();
    }
}
