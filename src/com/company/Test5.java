package com.company;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double Res = 0;
        System.out.print("Input A: ");
        double I1 = in.nextDouble();
        System.out.printf("Input Symbol: ", in.nextLine());
        String S = in.nextLine();
        System.out.print("Input B: ");
        double I2 = in.nextDouble();

        switch(S) {
            case "+":
                Res = I1 + I2;
                break;
            case "-":
                Res = I1 - I2;
                break;
            case "*":
                Res = I1 * I2;
                break;
            case "/":
                Res = I1 / I2;
                break;
            default:
                System.out.println("Invalid input");
        }
                System.out.printf("Res: %5.2f",Res);
                in.close();
    }
}
